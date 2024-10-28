package services;

import models.City;
import models.Tour;
import models.DomesticTour; // Import DomesticTour
import models.InternationalTour; // Import InternationalTour
import java.util.ArrayList;
import java.util.List;

public class TourManager {
    // Assume we have a list of predefined tours for demonstration purposes
    private static final List<Tour> predefinedTours = new ArrayList<>();

    static {
        predefinedTours.add(new DomesticTour("Paris", 800)); // example domestic tour
        predefinedTours.add(new InternationalTour("Rome", 1200)); // example international tour
        predefinedTours.add(new DomesticTour("Barcelona", 600));
        predefinedTours.add(new InternationalTour("New York", 1500));
        predefinedTours.add(new DomesticTour("Tokyo", 900));
    }

    public List<Tour> getAvailableTours(City city, double budget) {
        List<Tour> affordableTours = new ArrayList<>();
        for (Tour tour : predefinedTours) {
            // Check if the destination matches the selected city and if the price is within budget
            if (tour.getDestination().equalsIgnoreCase(city.name()) && tour.getPrice() <= budget) {
                affordableTours.add(tour);
            }
        }
        return affordableTours;
    }
}
