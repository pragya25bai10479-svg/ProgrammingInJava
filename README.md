# Smart Travel Budget Planner

## Project Overview

Smart Travel Budget Planner is a Java-based application that helps users plan and manage their travel expenses. It allows users to add traveler details, record expenses, analyze the total budget, and save a travel budget report.

## Problem Statement

Planning a trip involves managing different expenses such as transportation, accommodation, food, and activities. Manually tracking these expenses can be difficult. This project provides a simple application to organize and analyze travel expenses within a given budget.

## Objectives

- Add and manage traveler details.
- Add, view, update, and delete travel expenses.
- Calculate total and category-wise expenses.
- Analyze whether the trip is within the planned budget.
- Save the final travel report to a file.

## Main Features

1. Traveler Management
2. Expense Management
3. Budget Analysis
4. Report Generation
5. Input Validation
6. File Handling

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
└── .gitignore 
```

## OOP Concepts Used

### Abstraction
`Expense` is an abstract class that defines common properties and behavior for different types of expenses.

### Inheritance
Different expense types inherit from the `Expense` class.

### Polymorphism
Different expense objects are handled using the common `Expense` reference.

### Interface
The `Analyzer` interface defines the operations used for budget analysis.

### Encapsulation
Data members are kept private and accessed using methods such as getters and setters.

### Technologies Used
Java
Object-Oriented Programming
ArrayList
File Handling
Exception Handling

### How to Run
Open the project in VS Code or any Java IDE.
Open the src folder.
Compile the Java files:
javac *.java
Run the main program:
java Main
Menu Options
1. Add Traveler
2. Add Expense
3. View Expenses
4. Update Expense
5. Delete Expense
6. Budget Analysis
7. Save Report
8. Exit

### Output
The application displays travel information, expense records, total expenses, category-wise analysis, and budget status. A report can also be saved as a text file.

### Future Scope
Add a graphical user interface.
Add database connectivity.
Add charts for expense analysis.
Add multiple trip profiles.
Add login and user authentication.

### Conclusion
The Smart Travel Budget Planner demonstrates practical use of Java and Object-Oriented Programming concepts to solve a real-world travel budget management problem.
