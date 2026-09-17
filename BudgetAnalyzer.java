// INTERFACE
interface Analyzer {
    void analyze();
    double getTotal();
}


// INTERFACE IMPLEMENTATION
public class BudgetAnalyzer implements Analyzer {

    private ExpenseManager manager;
    private Trip trip;

    public BudgetAnalyzer(ExpenseManager manager, Trip trip) {
        this.manager = manager;
        this.trip = trip;
    }

    @Override
    public double getTotal() {
        return manager.getTotal();
    }

    @Override
    public void analyze() {

        double total = getTotal();
        double budget = trip.getBudget();
        double remaining = budget - total;

        System.out.println("\n----- BUDGET ANALYSIS -----");
        System.out.println("Destination: " + trip.getDestination());
        System.out.println("Budget: Rs. " + budget);
        System.out.println("Total Expense: Rs. " + total);
        System.out.println("Remaining: Rs. " + remaining);

        if (remaining < 0)
            System.out.println("Status: OVER BUDGET");
        else
            System.out.println("Status: WITHIN BUDGET");

        System.out.printf("Budget Used: %.2f%%%n",
                (total / budget) * 100);
    }
}