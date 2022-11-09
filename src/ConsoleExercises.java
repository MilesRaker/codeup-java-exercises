import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args){

        // Ex. 1
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + String.format("%.2f", pi));

        // Ex. 2: Explore Scanner Class
        Scanner scanner = new Scanner(System.in);
/*        System.out.println("Enter an integer: ");
        int input = scanner.nextInt(); // if I enter a non-int value, a runtime exception occurs
        System.out.println("You entered: " + input);

        // System.out.println("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("Word One: " + word1);
        System.out.println("Word Two: " + word2);
        System.out.println("Word Three: " + word3);*/
        // if I enter more than three words, any excess words are not captured in variables
        // if I enter less than three words, the input waits for me to enter three.
        System.out.println("Enter a sentence: ");
        //scanner.next(); // only the first word is stored, because .next() accepts only one token
        String sentence = scanner.nextLine(); // rewritten with nextLine() method
        System.out.println("Your sentence: " + sentence);

        // Ex. 3: Calculate the perimeter and area of Codeup's classrooms
        System.out.println("What is the width of your room, in feet?");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the length of your room, in feet?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("The area of your room is: " + width*length + " square feet.");
        System.out.println("The perimeter of your room is: " + (2*width + 2*length) + " feet.");

        // Bonus

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Enter three doubles, length, width, height: ");
        double length1 = sc.nextDouble();
        double width1 = sc.nextDouble();
        double height1 = sc.nextDouble();

        System.out.println("You entered: " + length1 + ", " + width1 + ", " + height1);
        // scanner is now picking up one token per line,
        // so having the user enter the three dimensions on three sequential lines works.
    }
}
