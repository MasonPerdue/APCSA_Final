// imports math class for random
import java.lang.Math;

// class of each site data
public class SITE {
    // instance variables private to the class
    String site = "";
    String user = "";
    String pw = "";
    String note = "";

    // overloading constructors
    // constructor with all parameters
    public SITE(String site, String user, String pw, String note){
        this.site = site;
        this.user = user;
        this.pw = pw;
        this.note = note;
    }

    // constructor for default site
    public SITE(){
        // this. keyword calls other constructor
        this("site", "user", "pw", "note");
    }

    // contructor with out pw (to generate random pw)
    public SITE(String site, String user, String note){
        // instert method call to make random pw
        // this. keyword calls other constructor
        this(site, user, randPW(), note);
    }

    // method to return string value for random password that is only accessible within class and by class
    private static String randPW(){
        // strings for pulling characters from
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperLetters = lowerLetters.toUpperCase();
        String numbers = "1234567890";
        String symbols = "!@#$%^&*():;'/?.>,<[{}]=_+-~`|";

        // max password length
        int max = 20;

        // empty string to hold password
        String pw = "";

        

        // returns generated password
        return pw;
    }
}
