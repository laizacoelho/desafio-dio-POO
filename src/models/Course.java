package models;

public class Course extends Content{
    private Integer workload;

    public Course() {
    }

    public Course(String title, String description, Integer workload) {
        super(title, description);
        this.workload = workload;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP * workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}
