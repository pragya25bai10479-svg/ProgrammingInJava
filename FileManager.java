import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveReport(Trip trip,
                                  ExpenseManager manager,
                                  Analyzer analyzer) {

        try {

            File folder = new File("data");

            if (!folder.exists())
                folder.mkdir();

            FileWriter writer =
                    new FileWriter("data/trip_data.txt");

            writer.write("SMART TRAVEL BUDGET REPORT\n");
            writer.write("==========================\n");
            writer.write(trip.toString() + "\n\n");

            writer.write("EXPENSES\n");
            writer.write("--------\n");

            for (Expense e : manager.getExpenses())
                writer.write(e + "\n");

            writer.write("\nTOTAL EXPENSE: Rs. "
                    + analyzer.getTotal());

            writer.close();

            System.out.println("Report saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving report.");
        }
    }
}