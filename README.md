# Smart Travel Budget Planner

## Overview

Smart Travel Budget Planner is a Java-based application designed to help users plan and manage their travel expenses. It allows users to store traveler details, manage different types of expenses, analyze the total budget, and generate a travel budget report.

## Features

- Create and manage trip details.
- Add traveler information.
- Add, view, update, and delete expenses.
- Categorize expenses into transportation, accommodation, food, activities, and miscellaneous.
- Calculate total and category-wise expenses.
- Analyze whether the trip is within the planned budget.
- Save the travel budget report to a text file.
- Validate user input and handle invalid entries.

## Technologies and Tools Used

- Java
- Object-Oriented Programming
- Java ArrayList
- File Handling
- Exception Handling
- VS Code
- GitHub

## OOP Concepts Used

### Abstraction
The `Expense` class is an abstract class that provides common properties and behavior for expenses.

### Inheritance
Different expense types inherit from the `Expense` class.

### Polymorphism
Different expense objects are handled using the common `Expense` reference.

### Interface
The `Analyzer` interface defines operations for budget analysis.

### Encapsulation
Class data members are private and accessed through methods such as getters and setters.

## Project Structure

```text
ProgrammingInJava/
│
├── src/
│   ├── Main.java
│   ├── Trip.java
│   ├── Traveler.java
│   ├── Expense.java
│   ├── ExpenseManager.java
│   ├── BudgetAnalyzer.java
│   └── FileManager.java
│
├── data/
│   └── trip_data.txt
│
├── tests/
│   └── TestCases.txt
│
├── README.md
├── statement.md
└── .gitignore
```

### Installation and Setup
Install Java JDK on the computer.
Download or clone this repository.
Open the project folder in VS Code.
Open the src folder in the terminal.
Compile the Java files using:
javac *.java
Run the program using:
java Main
How to Use

After running the program, follow the menu displayed on the screen.

1. Add Traveler
2. Add Expense
3. View Expenses
4. Update Expense
5. Delete Expense
6. Budget Analysis
7. Save Report
8. Exit

Select an option by entering its number and pressing Enter.

### Testing Instructions

The project contains test cases in:

tests/TestCases.txt

The following functions should be tested:

Creating a trip
Adding a traveler
Adding an expense
Viewing expenses
Updating an expense
Deleting an expense
Performing budget analysis
Saving the report
Handling invalid input
Exiting the application
## Screenshots

### Main Menu
![Main Menu](screenshots/Main%20menu.png)

### Expense Management
![Expense Management](screenshots/Expense%20addition.png)

### Budget Analysis
![Budget Analysis](screenshots/Budget%20analysis.png)

### Report Saved
![Report Saved](screenshots/Expense%20report%20saved.png)

### Output
The application displays trip details, traveler information, expense records, total expenses, category-wise expenses, and budget status.

### Future Scope
Graphical user interface.
Database connectivity.
Expense charts and visualizations.
Multiple trip profiles.
User login and authentication.

### Conclusion
Smart Travel Budget Planner demonstrates the practical use of Java and Object-Oriented Programming concepts to develop a simple travel expense management system.
