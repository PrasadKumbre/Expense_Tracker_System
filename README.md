# Expense Manager App - README

## Overview
The **Expense Manager App** is an Android application developed using Java, XML, and SQLite database for managing personal finances. This app allows users to track their income, expenses, and balance. Users can easily add, update and view financial transactions with an intuitive user interface.

---

## Features
- **Add or Edit Income and Expense**: Users can record or modify transactions by entering the amount, description, and category (e.g., Food, Transport, Salary).
- **Secure Login**: Protect access to the app using a secure login feature to safeguard your financial data.
- **View Detailed Reports**: Users can analyze their financial data with interactive pie charts, providing a visual representation of income and expenses by category.
- **View Transactions**: Users can view their transaction history with details of date, amount, category, and description.
- **Update and Transactions**: Users can update previously recorded transactions.
- **SQLite Database**: Transactions are stored securely in an SQLite database.

---

## Technologies Used
- **Java**: Main programming language for the logic of the application.
- **XML**: Layout design for the app's user interface.
- **SQLite**: Database used to store and manage transaction data locally.
- **Android Studio IDE**: The development environment used to build and run the app.

---

## Prerequisites
Before using this app, ensure you have the following:
- Android Studio installed on your computer.
- A connected Android device or emulator to run the app.

---

## Installation

### Clone or Download the Project:
1. Clone or download the project from the repository.

### Set up the project in Android Studio:
1. Open Android Studio and click on "Open an existing project."
2. Navigate to the folder where you have downloaded or cloned the project and select it.
3. Wait for Android Studio to sync the project.

### Build and Run the App:
1. Connect an Android device or start an emulator.
2. Click the **Run** button (green triangle) in Android Studio.
3. Select your device from the available options.
4. Wait for the app to launch.

---

## App Usage

### Main Screen:
- **Transaction List**: Displays a list of all recorded transactions with their amount, category, and date.
- **Add Transaction**: Tap the "+" button to add a new transaction. You can select the category, enter the description, and specify the amount.
- **View Balance**: The app calculates the total balance from your recorded income and expenses, displayed at the top of the screen.

### Transaction Details:
- Tap any transaction in the list to view more details.
- You can update transactions from this screen.

### Secure Login:
- The app requires users to log in with a secure username and password to access their data.

### Reports:
- View a detailed breakdown of income and expenses with pie charts. These charts visually represent spending and earning patterns by category, helping users analyze their financial habits.

---

## Database Structure

The app uses a local SQLite database to store transaction data. The database has the following table:

### `Expense` Table:

| Column Name   | Data Type   | Description                      |
|---------------|-------------|----------------------------------|
| `id`          | INTEGER     | Unique identifier (primary key) |
| `amount`      | REAL        | Amount of the transaction       |
| `category`    | TEXT        | Category of the transaction     |
| `note`        | TEXT        | Description of the transaction  |
| `date`        | TEXT        | Date and time of the transaction|

### `Income` Table:

| Column Name   | Data Type   | Description                      |
|---------------|-------------|----------------------------------|
| `id`          | INTEGER     | Unique identifier (primary key) |
| `amount`      | REAL        | Amount of the transaction       |
| `category`    | TEXT        | Category of the transaction     |
| `note`        | TEXT        | Description of the transaction  |
| `date`        | TEXT        | Date and time of the transaction|


### `users` Table (for Secure Login):

| Column Name   | Data Type   | Description                      |
|---------------|-------------|----------------------------------|
| `id`          | INTEGER     | Unique identifier (primary key) |
| `username`    | TEXT        | User's login username           |
| `password`    | TEXT        | User's hashed password          |

---

## Code Structure

### 1. **Activities:**
- `MainActivity.java`: Displays the home dashboard and provides navigation options.
- `HomeActivity.java`: Displays the transaction list and allows users to add and view transactions.
- `SignUpActivity.java`: Handles user registration and login functionality.

### 2. **Fragments:**
- `DashboardFragment.java`: Displays a summary of income, expenses, and balance.
- `ExpenseFragment.java`: Manages expense-related features.
- `IncomeFragment.java`: Manages income-related features.

### 3. **Adapters:**
- `ExpenseAdapter.java` and `ExpenseAdapter2.java`: Handle displaying expense data in lists.
- `IncomeAdapter.java` and `IncomeAdapter2.java`: Handle displaying income data in lists.

### 4. **Database Helper:**
- `DatabaseHandler.java` and `DatabaseHandlerExpense.java`: Manage database interactions for transactions.
- `DatabaseHelper.java`: Handles SQLite operations, such as table creation and data queries.

### 5. **Model Classes:**
- `ExpenseModel.java`: A model class that represents a single Expanse, including its properties (amount, description, category, date).
- `IncomeModel.java`: A model class that represents a single Income, including its properties (amount, description, category, date).

### 6. **Utilities:**
- `PieChartIncome.java` and `PieChartExpense.java`: Generate pie charts for visualizing income and expense data.

---

## Future Enhancements
- **Cloud Sync**: Sync data with cloud storage for backup and multi-device access with help of Firebase.
- **Budget Tracker**: Implement a feature to track budgets for different categories.

---

## License

This project is open-source. Feel free to use, modify, and distribute it.

---

## Acknowledgments
- SQLite: For providing an efficient local database solution.
- Android Developers: For the Android SDK and excellent documentation.

---

## Sample ScreenShorts of App
**1) Log in Page :-**
![image](https://github.com/user-attachments/assets/f374d2c9-8237-40e2-aff5-4a357b46c521)

**2) Home /Dashboard Page :-**
![image](https://github.com/user-attachments/assets/605e7070-73d4-434d-88ca-5423f0d2c3dc)

**3) Add Income Page :-**
![image](https://github.com/user-attachments/assets/76fd3242-93a4-4612-9c12-2f1df53d9042)

**4) Income Page :-**
![image](https://github.com/user-attachments/assets/56a6bbac-1299-4774-8e5c-16646082587a)

**5) Income Report page (In Pie Chart) :-**
![image](https://github.com/user-attachments/assets/adea09d3-4291-446a-b9f6-43d6f1c823e9)

---

For any issues or contributions, feel free to open an issue or pull request in the GitHub repository.
