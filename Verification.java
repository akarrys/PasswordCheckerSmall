package loginlayout;
import java.util.Scanner;

public class Verification extends LogInScreen { //Verification subclass inherits LogInScreen super class
    static int response;


    public Verification(int eid) {
        super(eid);
    }

    public static boolean isAccepted() { //method for asking and checking given password randomly generated
        Scanner ui = new Scanner(System.in);
        System.out.println("Password: ");
        response = ui.nextInt();

        if (response != answer) {
            System.out.println("False, please try again");
            return false;
        } else if (response == answer) {
            System.out.println("Accepted");
            return true;
        } else{
            return false;
        }

    }
}
