import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Trip trip = new Trip();

        System.out.println("=== SMART TRAVEL BUDGET PLANNER ===");

        trip.setUserName(readText("Enter your name: "));
        trip.setDestination(readText("Enter destination: "));
        trip.setDays(readInt("Enter number of days: "));
        trip.setBudget(readDouble("Enter total budget: "));

        ExpenseManager manager = new ExpenseManager();

        // Interface reference -> Polymorphism
        Analyzer analyzer = new BudgetAnalyzer(manager, trip);

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Traveler");
            System.out.println("2. Add Expense");
            System.out.println("3. View Expenses");
            System.out.println("4. Update Expense");
            System.out.println("5. Delete Expense");
            System.out.println("6. Budget Analysis");
            System.out.println("7. Save Report");
            System.out.println("8. Exit");

            choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:
                    String name = readText("Traveler name: ");
                    int age = readInt("Age: ");
                    trip.addTraveler(new Traveler(name, age));
                    System.out.println("Traveler added.");
                    break;

                case 2:
                    addExpense(manager);
                    break;

                case 3:
                    manager.displayExpenses();
                    break;

                case 4:
                    manager.displayExpenses();

                    if (!manager.isEmpty()) {
                        int id = readInt("Enter expense ID: ");
                        double amount = readDouble("New amount: ");
                        String desc = readText("New description: ");

                        if (manager.updateExpense(id, amount, desc))
                            System.out.println("Expense updated.");
                        else
                            System.out.println("Expense not found.");
                    }
                    break;

                case 5:
                    manager.displayExpenses();

                    if (!manager.isEmpty()) {
                        int id = readInt("Enter expense ID: ");

                        if (manager.deleteExpense(id))
                            System.out.println("Expense deleted.");
                        else
                            System.out.println("Expense not found.");
                    }
                    break;

                case 6:
                    analyzer.analyze();
                    break;

                case 7:
                    FileManager.saveReport(trip, manager, analyzer);
                    break;

                case 8:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }

    static void addExpense(ExpenseManager manager) {

        System.out.println("\n1. Transportation");
        System.out.println("2. Accommodation");
        System.out.println("3. Food");
        System.out.println("4. Activity");
        System.out.println("5. Miscellaneous");

        int type = readInt("Choose category: ");
        double amount = readDouble("Enter amount: ");
        String description = readText("Enter description: ");

        Expense expense;

        switch (type) {
            case 1:
                expense = new TransportationExpense(amount, description);
                break;
            case 2:
                expense = new AccommodationExpense(amount, description);
                break;
            case 3:
                expense = new FoodExpense(amount, description);
                break;
            case 4:
                expense = new ActivityExpense(amount, description);
                break;
            case 5:
                expense = new MiscellaneousExpense(amount, description);
                break;
            default:
                System.out.println("Invalid category.");
                return;
        }

        manager.addExpense(expense);
        System.out.println("Expense added.");
    }

    static String readText(String message) {
        System.out.print(message);
        String input = sc.nextLine();

        while (input.trim().isEmpty()) {
            System.out.print("Enter a valid value: ");
            input = sc.nextLine();
        }

        return input;
    }

    static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                double value = Double.parseDouble(sc.nextLine());

                if (value > 0)
                    return value;

                System.out.println("Enter a value greater than 0.");

            } catch (NumberFormatException e) {
                System.out.println("Enter a valid amount.");
            }
        }
    }
}