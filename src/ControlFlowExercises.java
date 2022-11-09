public class ControlFlowExercises {
    public static void main(String[] args){
        // Fizzbuzz
        for(int i = 1; i <= 100; i++){
            String logOutput= "";
            if(i%3 == 0){
                logOutput += "Fizz";
            } if(i%5 == 0){
                logOutput += "Buzz";
            }
            System.out.println(i + " " + logOutput);
        }
    }
}
