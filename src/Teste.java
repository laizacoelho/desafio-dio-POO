import models.Bootcamp;
import models.Course;
import models.Developer;
import models.Mentoring;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Course course1 = new Course("Java 1", "Basic java course", 30);
        Course course2 = new Course("Java 2", "Senior java course", 55);
        Mentoring mentoring = new Mentoring("Java Bootcamp",
                "Advanced java bootcamp", LocalDate.of(2022,10,20));

        System.out.println(course1);
        System.out.println("Course name: " + course1.getTitle() + " ,total XP: " + course1.calculateXP());
        System.out.println(mentoring);
        System.out.println("Mentoring name: " + mentoring.getTitle() + " ,total XP: " + mentoring.calculateXP());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        System.out.println("-------------");

        Developer devCamila = new Developer();
        devCamila.setName("Camila");
        devCamila.subscribeBootcamp(bootcamp);
        System.out.println("Camila's subscribed courses: " + devCamila.getSubscribedContents());
        devCamila.progress();
        System.out.println("-");
        System.out.println("Camila's subscribed courses: " + devCamila.getSubscribedContents());
        System.out.println("Camila's finished courses: " + devCamila.getFinishedContents());
        System.out.println("XP: " + devCamila.calculateXP());

        System.out.println("-------------");

        Developer devJoao = new Developer();
        devJoao.setName("Joao");
        devJoao.subscribeBootcamp(bootcamp);
        System.out.println("Joao's subscribed courses: " + devJoao.getSubscribedContents());
        devJoao.progress();
        System.out.println("-");
        System.out.println("Joao's subscribed courses: " + devJoao.getSubscribedContents());
        devJoao.progress();
        System.out.println("-");
        System.out.println("Joao's subscribed courses: " + devJoao.getSubscribedContents());
        System.out.println("Joao's finished courses: " + devJoao.getFinishedContents());
        System.out.println("XP: " + devJoao.calculateXP());
    }
}
