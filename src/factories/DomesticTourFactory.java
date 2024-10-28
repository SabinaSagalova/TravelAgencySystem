package factories;

import models.DomesticTour;
import models.Tour;

public class DomesticTourFactory extends TourFactory {
    @Override
    public Tour createTour(String destination, double price) {
        return new DomesticTour(destination, price);
    }
}


