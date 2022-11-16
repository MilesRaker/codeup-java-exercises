import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void guessNumber() {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int rand = r.nextInt(100);
        int count = 0;
        while (loop) {
            System.out.println("Welcome to HighLow");
            System.out.println("I have picked a number between 1 and 100, guess it if you can!");
            System.out.println("Enter an integer: ");
            int scIn = sc.nextInt();
            count ++;
            if (scIn == rand) {
                System.out.println("GOOD GUESS!");
                System.out.printf("You were correct in %d guesses%n", count);
                return;
            } else if (scIn < rand) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
            System.out.println("Do you want to guess again? Y || N?");
            String strIn = sc.next();
            if(strIn.equalsIgnoreCase("n")){
                loop=false;
            }
        }
    }
    public static void main(String[] args) {
        guessNumber();

    }
}
