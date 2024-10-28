package factories;

import models.Tour;

public abstract class TourFactory {
    public abstract Tour createTour(String destination, double price);
}
