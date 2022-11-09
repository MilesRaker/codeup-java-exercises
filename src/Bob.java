import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean keepTalking = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Hey, I'm Bob.");
            System.out.println("What's up?");
            String input = sc.nextLine();
            String response = "";
            if (input.isEmpty()){
                response = "Whatever man, I'm outta here.";
                keepTalking = false;
            } else if(input.charAt(input.length() - 1) == '!'){
                response = "Back off mannnnn!";
            } else if(input.charAt(input.length() - 1) == '?'){
                response = "No way dude.";
            } else {
                response = "Whatever.";
            }
            System.out.println("response = " + response);

        }while(keepTalking);
    }
}
