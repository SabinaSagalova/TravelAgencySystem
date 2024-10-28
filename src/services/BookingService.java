package services;

import models.Tour;

public class BookingService {
    private static BookingService instance;

    private BookingService() {
    }

    public static BookingService getInstance() {
        if (instance == null) {
            instance = new BookingService();
        }
        return instance;
    }

    public void bookTour(Tour tour) {
        System.out.printf("Бронирование тура в %s за $%.2f%n", tour.getDestination(), tour.getPrice());
    }
}
