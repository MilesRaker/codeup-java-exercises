public class ControlFlowExercises {
    public static void main(String[] args){
/*        int i = 0;
        do{
            System.out.println(i);
            i += 2;
        } while(i<=100);*/

/*        int i = 100;
        do{
            System.out.println(i);
            i -= 5;
        } while(i >= -10);*/

/*        long i = 2; // needed to change from int to long
        do{
            System.out.println(i);
            i = i * i;
        } while(i <= 1000000);*/

        // Refactoring to use for loops

/*        for(int i = 0; i <= 100; i += 2){
            System.out.println(i);
        }*/

/*        for(int i = 100; i>= -10; i -= 5){
            System.out.println(i);
        }*/

        for(long i = 2; i <= 1000000; i = i * i){
            System.out.println(i);
        }
    }
}
