package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no: ");
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase("yes")
            || userInput.equalsIgnoreCase("y")
            || userInput.equalsIgnoreCase("yeah")){
            return true;
        } return false;
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        System.out.println("Enter yes or no: ");
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase("yes")
            || userInput.equalsIgnoreCase("y")
            || userInput.equalsIgnoreCase("yeah")){
            return true;
        } return false;
    }

    public int getInt( int min, int max){
        System.out.printf("Enter an integer between %d and %d", min, max);
        int userInput = scanner.nextInt();
        if(userInput > min && userInput < max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInt(min, max); // using recursion to let user try again
        }
    }
    public int getInt( int min, int max, String prompt){
        System.out.println(prompt);
        System.out.printf("Enter an integer between %d and %d", min, max);
        int userInput = scanner.nextInt();
        if(userInput > min && userInput < max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInt(min, max); // using recursion to let user try again
        }
    }

    public int getInt(){
        System.out.println("Enter an integer:");
        return scanner.nextInt();
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        System.out.println("Enter an integer:");
        return scanner.nextInt();
    }

    public double getDouble( int min, int max){
        System.out.printf("Enter an double between %d and %d", min, max);
        double userInput = scanner.nextDouble();
        if(userInput > min && userInput < max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getDouble(min, max); // using recursion to let user try again
        }
    }
    public double getDouble( int min, int max, String prompt){
        System.out.println(prompt);
        System.out.printf("Enter an double between %d and %d", min, max);
        double userInput = scanner.nextDouble();
        if(userInput > min && userInput < max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getDouble(min, max); // using recursion to let user try again
        }
    }

    public double getDouble(){
        System.out.println("Enter an Double:");
        return scanner.nextDouble();
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        System.out.println("Enter an Double:");
        return scanner.nextDouble();
    }
}
