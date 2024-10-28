package observers;

public class NotificationService implements Observer {
    private String name;

    public NotificationService(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

