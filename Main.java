// imports class for scanner from java libraries
import java.util.Scanner;

// file that contains main method
public class Main{
    // main method that runs to start program
    public static void main(String[] args){
        // prints welcome message
        System.out.println("\n\tPWMAN v.1");
        System.out.println("\tEnter a command without spaces. Type \"help\" for command list or \"exit\" to leave program.");

        // creates scanner object6 to take input from user
        Scanner input = new Scanner(System.in);

        // empty string for command input
        String cmd = "";

        // creates main program loop that continues until break statement
        while(true){
            // starts "shell" prompt
            System.out.print("\t> ");

            // takes user input and processes command to lower case to allow for checking its value
            cmd = input.nextLine().toLowerCase();

            // checks if input command is "exit"
            if(cmd.equals("exit") || cmd.equals("e")){
                // ends main loop
                break;
            }else{
                // calls static method from CMD class with entered command string as parameter
                // runs specific method depending on inputed parameter
                CMD.run(cmd);
            }
        }

        // closes scanner object
        input.close();

        // prints goodbye message
        System.out.println("\tUser exited program.\n");
    }
}