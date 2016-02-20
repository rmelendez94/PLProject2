package melendez.ui;

import melendez.business.Customer;
import melendez.business.Employee;

public class PersonApp {

    public static void main(String[] args) {
        //Calls the method that runs the loop for Customer Viewer
        runProgram();
    }

    public static void runProgram(){
        //Object differentiation and Loop control variables
        String type;
        String keepGoing = "y";

        //Initiate the output welcome message
        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        //Keep going as long as user enters a "y"
        while (keepGoing.equalsIgnoreCase("y")) {
            //Take in the type from user
            type = Console.getString("Create customer or employee? (c/e): ");
            Console.displayLine();

            //If/Else for when user inputs c or e somewhere here
            if(type.equalsIgnoreCase("c")){
                //Create and fill information in the customer
                Customer cust;
                cust = new Customer();
                cust.setFirstName(Console.getString("Enter first name: "));
                cust.setLastName(Console.getString("Enter last name: "));
                cust.setEmail(Console.getString("Enter email address: "));
                cust.setCustomerNumber(Console.getString("Customer number: "));
                Console.displayLine();

                //Display the newly created customer
                System.out.print(cust.getDisplayText());
                Console.displayLine();
                Console.displayLine();
            }else{ //Then the type is employee
                //Create and fill information for employee
                Employee emp = new Employee();
                emp.setFirstName(Console.getString("Enter first name: "));
                emp.setLastName(Console.getString("Enter last name: "));
                emp.setEmail(Console.getString("Enter email address: "));
                emp.setSocialSecurity(Console.getString("Social security number: "));
                Console.displayLine();

                //Display the newly created employee
                Console.displayLine("You entered: ");
                Console.displayLine(emp.getDisplayText());
                Console.displayLine();
                Console.displayLine();
            }

            //Ask if they want to continue
            keepGoing = Console.getString("Continue? (y/n): ");


        }

    }
}
