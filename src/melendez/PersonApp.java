package melendez;

import java.util.Scanner;

public class PersonApp {

    public static void main(String[] args) {
        //Construct a new scanner for user input
        Scanner s = new Scanner(System.in);
        //Calls the method that runs the loop for Customer Viewer
        runProgram(s);
    }

    public static void runProgram(Scanner s){
        //Object differentiation and Loop control variables
        String type = "";
        //The following two may actually not be necessary
        int customerNumber = 0;
        String socialSecurity = "";
        String keepGoing = "y";

        //Initiate the output welcome message
        System.out.println("Welcome to the Person Tester application\n");

        //Keep going as long as user enters a "y"
        while (keepGoing.equalsIgnoreCase("y")) {
            //Take in the type from user
            System.out.print("Create customer or employee? (c/e): ");
            type = s.next();
            System.out.println();

            //If/Else for when user inputs c or e somewhere here
            if(type.equalsIgnoreCase("c")){
                Customer cust = new Customer();
                //These still need parameters
                /*cust.setFirstName();
                cust.setLastName();

                cust.setCustomerNumber();*/
                //Ask for name email and number
            }
            //This should probably be just an else statement since if its not
            //a customer then it has to default to employee, but i just
            //put it in its own if for now to be explicitly redundant and clear
            if(type.equalsIgnoreCase("e")){
                //Ask for name email and social
            }

            //after we know if it is a customer or empoyee dislpay stuff here

        }

    }
}
