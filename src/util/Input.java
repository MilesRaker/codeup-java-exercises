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
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes")
                || userInput.equalsIgnoreCase("y")
                || userInput.equalsIgnoreCase("yeah");
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        System.out.println("Enter yes or no: ");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes")
                || userInput.equalsIgnoreCase("y")
                || userInput.equalsIgnoreCase("yeah");
    }

/*    public int getInt( int min, int max){
        System.out.printf("Enter an integer between %d and %d", min, max);
        int userInput = scanner.nextInt();
        if(userInput > min && userInput < max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInt(min, max); // using recursion to let user try again
        }
    }*/
    public int getInt( int min, int max, String prompt){
        System.out.println(prompt);
        System.out.printf("Enter an integer between %d and %d", min, max);
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if(userInput > min && userInput < max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInt(min, max); // using recursion to let user try again
        }

    }

//    public int getInt(){
//        System.out.println("Enter an integer:");
//        int output = scanner.nextInt();
//        scanner.nextLine();
//        return output;
//    }

    public int getInt(){
        String input = getString();
        int output = -1;
        try{
            output = Integer.valueOf(input);
        } catch (Exception e){
            System.out.println("Invalid input, not an integer");
            System.out.println("Enter a valid integer this time...");
            getInt();
        }
        return output;
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        System.out.println("Enter an integer:");
        int output = scanner.nextInt();
        scanner.nextLine();
        return output;
    }

    public double getDouble( int min, int max){
        System.out.printf("Enter an double between %d and %d", min, max);
        double userInput = scanner.nextDouble();
        scanner.nextLine();
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
        scanner.nextLine();
        if(userInput > min && userInput < max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getDouble(min, max); // using recursion to let user try again
        }
    }

//    public double getDouble(){
//        System.out.println("Enter an Double:");
//        double output = scanner.nextDouble();
//        scanner.nextLine();
//        return output;
//    }

    public double getDouble(){
        String input = getString();
        double output = -1;
        try{
            output = Double.valueOf(input);
        } catch(Exception e){
            System.out.println("Invalid input, not a double");
            System.out.println("Enter a valid double this time...");
            getDouble();
        }
        return output;
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        System.out.println("Enter an Double:");
        double output = scanner.nextDouble();
        scanner.nextLine();
        return output;
    }


    // Get int method walkthrough

    // class Input
    // instantiate a new input:  Input in = new Input(System.in);

    public int getInt(int min, int max){
        // ask user for input integer
        // check if input integer is in range
        // in range? return input : ask for new input
        // Loop to get extra inputs
        // Loop has a flag/condition
        boolean flag = true;
        int userInput = 0;

        while(flag){
            System.out.println("Hey, enter an integer~!");
            userInput = scanner.nextInt();
            //is input valid??
            if(userInput < max && userInput > min){
                flag = false;
            }
        }

        return userInput;
    }

    public int getBinary(){
        System.out.println("Enter a binary number: ");
        String binaryIn = getString();
        int binaryOut = -1;
        try{
            binaryOut = Integer.valueOf(binaryIn, 2);
        } catch(Exception e){
            System.out.println("Invalid input, not a valid binary");
            System.out.println("Enter a valid binary this time...");
            getBinary();
        }
        return binaryOut;
    }

    public int getHex(){
        System.out.println("Enter a hex number: ");
        String hexIn = getString();
        int hexOut = -1;
        try{
            hexOut = Integer.valueOf(hexIn, 16);
        } catch(Exception e){
            System.out.println("Invalid input, not a valid hex");
            System.out.println("Enter a valid hex this time...");
            getBinary();
        }
        return hexOut;
    }
}
