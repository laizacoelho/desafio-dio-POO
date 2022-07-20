package models;

import interfaces.IDeveloper;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
public class Developer implements IDeveloper {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    @Override
    public void progress() {
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if(content.isPresent()){
            this.finishedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("You do not have subscribed contents!");
        }
    }

    @Override
    public double calculateXP() {
        return this.finishedContents
                .stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Developer developer = (Developer) o;

        if (name != null ? !name.equals(developer.name) : developer.name != null) return false;
        if (subscribedContents != null ? !subscribedContents.equals(developer.subscribedContents) : developer.subscribedContents != null)
            return false;
        return finishedContents != null ? finishedContents.equals(developer.finishedContents) : developer.finishedContents == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (subscribedContents != null ? subscribedContents.hashCode() : 0);
        result = 31 * result + (finishedContents != null ? finishedContents.hashCode() : 0);
        return result;
    }
}
