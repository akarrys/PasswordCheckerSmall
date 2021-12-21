package loginlayout;
import java.util.concurrent.ThreadLocalRandom;

public class LogInScreen {
    public static int answer; //password to be used in Verification class




    public LogInScreen(int eid){ //constructor
        answer = eid;
    }

    public static int conPass(){ //method to store password
        int int_random = ThreadLocalRandom.current().nextInt(); //method to generate random int thread for ans
        answer = int_random; //assign variable answer to random thread
        System.out.println("Make sure to remember your randomly generated number for authentication");
        System.out.println(answer); //prints password to display
        return answer;

    }

}
