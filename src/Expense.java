// ABSTRACTION
abstract class Expense {

    private static int nextId = 1;

    // ENCAPSULATION
    private int id;
    private double amount;
    private String description;

    public Expense(double amount, String description) {
        this.id = nextId++;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return "ID: " + id +
                " | " + getCategory() +
                " | Rs. " + amount +
                " | " + description;
    }
}


// INHERITANCE
class TransportationExpense extends Expense {

    public TransportationExpense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getCategory() {
        return "Transportation";
    }
}


class AccommodationExpense extends Expense {

    public AccommodationExpense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getCategory() {
        return "Accommodation";
    }
}


class FoodExpense extends Expense {

    public FoodExpense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getCategory() {
        return "Food";
    }
}


class ActivityExpense extends Expense {

    public ActivityExpense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getCategory() {
        return "Activity";
    }
}


class MiscellaneousExpense extends Expense {

    public MiscellaneousExpense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getCategory() {
        return "Miscellaneous";
    }
}
