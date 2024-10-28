package main;

import models.City;
import models.Tour;
import services.TourManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TourSystem {
    private static final TourManager tourManager = new TourManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш бюджет: ");
        double budget = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        System.out.println("Выберите город из списка:");
        for (City city : City.values()) {
            System.out.println(city.ordinal() + 1 + ". " + city);
        }

        System.out.print("Введите номер города: ");
        int cityChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (cityChoice < 1 || cityChoice > City.values().length) {
            System.out.println("Неверный выбор города. Завершение программы.");
            return;
        }

        City selectedCity = City.values()[cityChoice - 1];
        List<Tour> affordableTours = tourManager.getAvailableTours(selectedCity, budget);

        System.out.println("\nДоступные туры в " + selectedCity + " в рамках вашего бюджета:");
        if (affordableTours.isEmpty()) {
            System.out.println("Нет доступных туров в рамках вашего бюджета.");
        } else {
            for (Tour tour : affordableTours) {
                System.out.println(tour);
            }
        }

        scanner.close();
    }
}
