// imports class for scanner from java libraries
import java.util.Scanner;

// class for dealing with each inputed command
public class CMD{
    

    // static class that can be called on class with input of entered command
    public static void run(String cmd){
        // creates scanner object for use in this method
        Scanner input = new Scanner(System.in);

        // runs specific private method based on parameter
        if(cmd.equals("help") || cmd.equals("h")){
            help();
        }else if(cmd.equals("new") || cmd.equals("n")){
            // asks for and saves parameters for PW class constructor
            System.out.println("\tEnter program or website: ");
            String site = input.nextLine();
            System.out.println("\tEnter username: ");
            String user = input.nextLine();
            System.out.println("\tEnter password:");
            String pw = input.nextLine();
            System.out.println("Enter note (or enter to skip): ");
            String note = input.nextLine();

            // insert way to create array of SITE objects here
        }

        // closes scanner object
        input.close();
    }

    // private static void classes for each command - only accessible from inside this class and no return values and callable w/o objects
    private static void help(){
        System.out.println("\tCommand\t\tAias\t\tFunction");
        System.out.println("\texit\t\te\t\texits program");
        System.out.println("\thelp\t\th\t\tprints command names and functions");
        System.out.println("\tnew\t\tn\t\tcreates new credential");
    }
}