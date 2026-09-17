import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    // CREATE
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    // READ
    public void displayExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("\n----- EXPENSES -----");

        for (Expense e : expenses)
            System.out.println(e);
    }

    // UPDATE
    public boolean updateExpense(int id,
                                 double amount,
                                 String description) {

        for (Expense e : expenses) {

            if (e.getId() == id) {
                e.setAmount(amount);
                e.setDescription(description);
                return true;
            }
        }

        return false;
    }

    // DELETE
    public boolean deleteExpense(int id) {

        return expenses.removeIf(e -> e.getId() == id);
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public boolean isEmpty() {
        return expenses.isEmpty();
    }

    public double getTotal() {

        double total = 0;

        for (Expense e : expenses)
            total += e.getAmount();

        return total;
    }
}