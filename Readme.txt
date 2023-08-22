Extract the Files:
Extract the contents of the downloaded ZIP file to a directory of your choice.

Setup Backend:
Before running the program, ensure that you have the Java development environment and Maven installed on your system.

Admin Configuration:

Open the admin.html file located in the src/main/resources/static directory using a web browser.
Configure the rates for daily allowance and car mileage using the input fields.
Define the available receipt types and their rates as needed.
Build Backend:

Open a terminal/command prompt and navigate to the extracted project directory.
Run the following commands:
bash
Copy code
cd BusinessTripReimbursementCalculationApplication
mvn clean install
Run Backend:

Run the following command to start the backend server:
arduino
Copy code
mvn spring-boot:run
The backend server will start at http://localhost:8080.
Open User Interface:

Open a web browser and go to http://localhost:8080/user.html.
User Interaction:

Click the "Add Reimbursement" button to add selected receipts to the list.
Configure the trip date, add receipts, daily allowance, and car mileage as needed.
The "Total Reimbursement" amount will be automatically calculated based on admin settings and user inputs.
Click the "Submit" button to send reimbursement data (customize this part based on your application's needs).
Admin Interaction:

Open the admin.html file located in the src/main/resources/static directory using a web browser.
Update the rates for daily allowance and car mileage if needed.
Define the available receipt types and their rates.
Configure reimbursement limits for single calculation results.
User Interaction (Continued):

After configuring admin settings, go back to the user.html interface.
Follow step 7 to calculate the reimbursement amount based on the updated admin settings.
Finish and Clean Up:

When you're done testing the application, close the web browser and stop the backend server (CTRL+C in the terminal).
You can now navigate through the files and customize the program further if needed.