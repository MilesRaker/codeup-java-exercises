package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        /************************* Initialize Students HashMap *************************/
        HashMap<String, Student> Students = new HashMap();

        // create students
        Student Miles = new Student("Miles");
        Student Laura = new Student("Laura");
        Student Lea = new Student("Lea");
        Student Penny = new Student("Penny");

        // add grades
        Miles.addGrade(100);
        Miles.addGrade(99);
        Miles.addGrade(98);

        Laura.addGrade(100);
        Laura.addGrade(99);
        Laura.addGrade(98);

        Lea.addGrade(100);
        Lea.addGrade(99);
        Lea.addGrade(98);

        Penny.addGrade(100);
        Penny.addGrade(99);
        Penny.addGrade(98);

        // add to hashmap
        Students.put("MilesRaker", Miles);
        Students.put("LRoar", Laura);
        Students.put("LEAEL", Lea);
        Students.put("KittenPenny", Penny);

        /************************* Command Line Interface *************************/
        boolean loop = true;
        Input in = new Input();
        while(loop){
            System.out.println("GRADES APPLICATION -- START..");
            System.out.println("******************************");
            System.out.println();
            System.out.println("Enter Student Username to see Student Details: ");
            System.out.println("MilesRaker | LRoar | LEAEL | KittenPenny");


            String userInput = in.getString();
            System.out.println();
            switch (userInput){
                case "MilesRaker":
                    System.out.println("Username: MilesRaker\n" + Students.get("MilesRaker").toString());
                    break;
                case "LRoar":
                    System.out.println("Username: LRoar\n" + Students.get("LRoar").toString());
                    break;
                case "LEAEL":
                    System.out.println("Username: LEAEL\n" + Students.get("LEAEL").toString());
                    break;
                case "KittenPenny":
                    System.out.println("Username: KittenPenny\n" + Students.get("KittenPenny").toString());
                    break;
                default:
                    System.out.println("invalid username");
                    break;
            }
            loop = in.yesNo("Do you want to continue?");
            System.out.println("loop = " + loop);
        }
    }
}
