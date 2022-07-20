package interfaces;

import models.Bootcamp;

public interface IDeveloper {
    void subscribeBootcamp(Bootcamp bootcamp);
    void progress();
    double calculateXP();
}
