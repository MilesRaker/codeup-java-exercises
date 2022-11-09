import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
/*        // convert numerical grade to alphabetic grade
        boolean again = true;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a grade between 0 and 100: ");
            int grade = sc.nextInt();
            if (grade >= 88) {
                System.out.println("Grade: A");
            } else if (grade >= 80) {
                System.out.println("Grade: B");
            } else if (grade >= 67) {
                System.out.println("Grade: C");
            } else if (grade > 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }

            System.out.println("Would you like to continue? Enter a Y or N: ");
            String userInputChar = sc.next();
            if (userInputChar.equalsIgnoreCase("Y")) {
                again = true;
            } else {
                again = false;
            }
        }
        while(again);*/

        // Bonus: refactor to add pluses and minuses
        // convert numerical grade to alphabetic grade
        boolean again = true;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a grade between 0 and 100: ");
            int grade = sc.nextInt();
            if (grade >= 93) {
                System.out.println("Grade: A");
            } else if (grade >= 90) {
                System.out.println("Grade: A-");
            } else if (grade >= 87) {
                System.out.println("Grade: B+");
            } else if (grade >= 83) {
                System.out.println("Grade: B");
            } else if (grade >= 80) {
                System.out.println("Grade: B-");
            } else if (grade >= 77) {
                System.out.println("Grade: C+");
            } else if (grade >= 73) {
                System.out.println("Grade: C");
            } else if (grade >= 70) {
                System.out.println("Grade: C-");
            } else if (grade >= 67) {
                System.out.println("Grade: D+");
            } else if (grade > 63) {
                System.out.println("Grade: D");
            } else if (grade >= 60) {
                System.out.println("Grade: D-");
            } else {
                System.out.println("Grade: F");
            }

            System.out.println("Would you like to continue? Enter a Y or N: ");
            String userInputChar = sc.next();
            if (userInputChar.equalsIgnoreCase("Y")) {
                again = true;
            } else {
                again = false;
            }
        }
        while(again);
    }
}
