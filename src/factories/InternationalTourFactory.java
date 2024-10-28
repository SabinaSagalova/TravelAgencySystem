package factories;

import models.InternationalTour;
import models.Tour;

public class InternationalTourFactory extends TourFactory {
    @Override
    public Tour createTour(String destination, double price) {
        return new InternationalTour(destination, price);
    }
}

