# Business Trip Reimbursement Application

This is a simple web application that allows users to calculate and track their business trip reimbursements. The application provides different functionalities for both administrators and users.

## Prerequisites

- Java Development Kit (JDK) 11 or higher installed on your system.
- Apache Maven installed on your system.
- Web browser to interact with the application.

## Setup

1. Clone or download this repository to your local machine.

2. Open a command prompt or terminal.

3. Navigate to the root directory of the project using the `cd` command.

## Building and Running

### Admin Interface

1. Navigate to the `admin` directory using the command prompt.

2. Compile the Java classes using the following command:

   ```shell
   mvn compile

Run the application using the following command:
mvn exec:java -Dexec.mainClass="com.example.AdminApp"

Open your web browser and go to http://localhost:8080/admin.html to access the admin settings.

User Interface
Navigate to the user directory using the command prompt.

Compile the Java classes using the following command:

mvn compile

Run the application using the following command:
mvn exec:java -Dexec.mainClass="com.example.UserApp"

Open your web browser and go to http://localhost:8080/user.html to access the user reimbursement interface.

Usage
Admin Settings (admin.html)
Configure daily allowance and car mileage rates.
Edit available receipt types.
Set reimbursement limits for calculations.
User Reimbursement (user.html)
Input trip details including date, receipt type, daily allowance, disable days, and car distance.
Click "Add Entry" to calculate reimbursement for each entry.
Click "Clear Entries" to clear the list of saved entries.


If this dosn't work then please try to import this project into an IDE and run the MainApp.java file
