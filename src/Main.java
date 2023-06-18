// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        //Here I'll create a method which checks a phone number.
        //First of all, a Scanner Method, which accepts a number.
       // String acceptedInput;
        String acceptedInput = new String();
       numberAccepting (acceptedInput);

        test(acceptedInput);


    }

    public static String numberAccepting(String acceptedInput ) {
        //This is a Scanner Method which accepts numbers
        System.out.println ("Please enter an Ukrainian number:");
       Scanner number = new Scanner(System.in);
        String acceptedNumber = number.next();
        acceptedInput = acceptedNumber;
        System.out.println (acceptedNumber);
        return acceptedInput = acceptedNumber;

    }
    //Here we will check inputs with the regex method:
    public static boolean test (String acceptedInput){
        Pattern pattern = Pattern.compile("\\d\\S\\W[^\\w]\\n+");
        Matcher matcher = pattern.matcher(acceptedInput);
        System.out.println("A number is verified.");

        return matcher.matches ();
    }
    //As I wanted to check shat was accepted into a massive, here is a method printing out accepted inputs;
    //public static String printingOutNumbers (String AcceptedInput){
     //   for (int i = 0; i<AcceptedInput.length; i++){

     //   }
    }

//}




