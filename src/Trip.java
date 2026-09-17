import java.util.ArrayList;

public class Trip {

    private String userName;
    private String destination;
    private int days;
    private double budget;

    private ArrayList<Traveler> travelers = new ArrayList<>();

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getUserName() {
        return userName;
    }

    public String getDestination() {
        return destination;
    }

    public int getDays() {
        return days;
    }

    public double getBudget() {
        return budget;
    }

    public void addTraveler(Traveler traveler) {
        travelers.add(traveler);
    }

    public void displayTravelers() {

        for (Traveler t : travelers)
            System.out.println(t);
    }

    @Override
    public String toString() {
        return "User: " + userName +
                "\nDestination: " + destination +
                "\nDays: " + days +
                "\nBudget: Rs. " + budget;
    }
}
