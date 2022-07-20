package models;

import java.time.LocalDate;

public class Mentoring extends Content{
    private LocalDate date;

    public Mentoring() {
    }

    public Mentoring(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP +20;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
