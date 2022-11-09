import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args){
        // Display a table of powers
        Scanner sc = new Scanner(System.in);
        System.out.println("USER! Enter an INTEGER!!");
        int inputInt = sc.nextInt();
        // display table of squares and cubes
        System.out.println("Here is your table:");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int i = 1; i <= inputInt; i++ ){

            long squared = i * i;
            long cubed = i * i * i;
            System.out.printf("%d      | %d       | %d    ", i, squared, cubed).println();
        }
    }
}
