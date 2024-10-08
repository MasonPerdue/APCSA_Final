// class for dealing with each inputed command
public class CMD{
    // static class that can be called on class with input of entered command
    public static void run(String cmd){
        // runs specific private method based on parameter
        if(cmd.equals("help") || cmd.equals("h")){
            help();
        }
    }

    // private static void classes for each command - only accessible from inside this class and no return values and callable w/o objects
    private static void help(){
        System.out.println("\tCommand\t\tAias\t\tFunction");
        System.out.println("\texit\t\te\t\tExits program");
        System.out.println("\thelp\t\th\t\tPrints command names and functions");
    }
}