import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    /* 1. Basic arithmetic */
    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        double out = 0;
        for(int i = 1; i <= num2; i++){
            out += num1;
        }
        return out;
    }

    public static double divide(double num1, double num2){
        if(num2 == 0){
            throw new RuntimeException("Cannot divide by zero.");
        }
        return num1/num2;
    }

    public static double recursiveMultiply(double num1, double num2){
        int count = 0;
        return multHelper(num1, num2, count);
    }

    public static double multHelper(double num1, double num2, int count){
        if( count == num2){
            return 0;
        }
        return num1 + multHelper(num1, num2, count + 1);
    }

    public static int modulus(int num1, int num2){
         //return (int) ((int) num1 % num2); // goal
        if(num2 == 0){
            throw new RuntimeException("Cannot divide by zero.");
        }
        int count = num1;
        while(count>=num2){
            count = count - num2;
        }
        return count;
    }




    /* 2. Validation Method */
    public static int validateInt(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int in = sc.nextInt();
        if(in < min || in > max){
            System.out.println("Enter a number between 1 and 10: ");
            in = sc.nextInt();
        }
        return in;
    }


    /* 3. Factorial Method */

    public static void factorial(){
        // gather and validate input

        boolean again = true;
    while(again) {
        long input = validateInt(1, 10);
        long factorial = 1;
        // calculate factorial
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);

        System.out.println("Do you want to calculate another factorial? Y || N?");
        Scanner sc = new Scanner(System.in);
        String scIn = sc.nextLine();
        if(scIn.toLowerCase().equals("n")){
            again = false;
        }
        else if (scIn.toLowerCase().equals("y")){
            again = true;
        } else {
            System.out.println("Invalid input. Factorial ending");
            return;
        }
    }
    }


    /* 4. Dic Roll Method */
    public static void rollDice(){
        boolean rollAgain = true;
        while(rollAgain) {
            int numSides = 0;
            int[] dieRolls = {1, 1};
            System.out.println("How many sides?");
            Scanner sc = new Scanner(System.in);
            numSides = sc.nextInt();

            Random r = new Random();
            dieRolls[0] =  r.nextInt(numSides);
            dieRolls[1] = r.nextInt(numSides);
            System.out.println("dieRolls = " + dieRolls[0] + " " + dieRolls[1]);
            System.out.println("Would you like to roll again? Y || N?");
            String scInput = sc.next();
            if(scInput.equalsIgnoreCase("n")){
                rollAgain = false;
            } else if(scInput.equalsIgnoreCase("y")){
                rollAgain = true;
            } else {
                System.out.println("Invlaid input. RollDice Ending.");
                return;
            }
        }
    }
    public static void main(String[] args) {
        /* 1. Basic Arithmetic */
        System.out.println("multiply(2, 3) = " + multiply(2, 3));
        System.out.println("recursiveMultiply(2,3) = " + recursiveMultiply(2, 3));
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("subtract(2,3) = " + subtract(2, 3));
        System.out.println("divide(6,3) = " + divide(6, 3));
        System.out.println("modulus(9,3) = " + modulus(9, 3));
        System.out.println("modulus(11,5) = " + modulus(11, 5));

        /* 2. Validation Method*/
        // validateInt(1,10);

        /* 3. Factorial */
        // factorial();

        /* 4. Roll Dice */
        rollDice();
    }
}
