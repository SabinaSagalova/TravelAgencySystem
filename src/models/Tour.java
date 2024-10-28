package models;

public abstract class Tour {
    protected String destination;
    protected double price;

    public Tour(String destination, double price) {
        this.destination = destination;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Tour to %s - Price: $%.2f", destination, price);
    }

    public abstract void showDetails();
}
