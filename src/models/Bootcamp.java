package models;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate endDate = initialDate.plusDays(45);
    private Set<Developer> subscribedDevelopers = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Developer> getSubscribedDevelopers() {
        return subscribedDevelopers;
    }

    public void setSubscribedDevelopers(Set<Developer> subscribedDevelopers) {
        this.subscribedDevelopers = subscribedDevelopers;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        if (name != null ? !name.equals(bootcamp.name) : bootcamp.name != null) return false;
        if (description != null ? !description.equals(bootcamp.description) : bootcamp.description != null)
            return false;
        if (initialDate != null ? !initialDate.equals(bootcamp.initialDate) : bootcamp.initialDate != null)
            return false;
        if (endDate != null ? !endDate.equals(bootcamp.endDate) : bootcamp.endDate != null) return false;
        if (subscribedDevelopers != null ? !subscribedDevelopers.equals(bootcamp.subscribedDevelopers) : bootcamp.subscribedDevelopers != null)
            return false;
        return contents != null ? contents.equals(bootcamp.contents) : bootcamp.contents == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (initialDate != null ? initialDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (subscribedDevelopers != null ? subscribedDevelopers.hashCode() : 0);
        result = 31 * result + (contents != null ? contents.hashCode() : 0);
        return result;
    }


}
