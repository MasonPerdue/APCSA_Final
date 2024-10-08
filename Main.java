// imports class for scanner from java libraries
import java.util.Scanner;

// file that contains main method
public class Main{
    // main method that runs to start program
    public static void main(String[] args){
        // prints welcome message
        System.out.println("\n\tPWMAN v.1");
        System.out.println("\tEnter a command without spaces. Type \"help\" for command list or \"exit\" to leave program.");

        // creates main program loop that continues until break statement
        while(true){
            // starts "shell" prompt
            System.out.print("\t> ");

            // creates scanner object to take input from user
            Scanner input = new Scanner(System.in);

            // takes user input
            String cmd = input.nextLine();

            // processes command to allow for checking its value
            cmd = cmd.toLowerCase();

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

        // prints goodbye message
        System.out.println("\tUser exited program.\n");
    }
}