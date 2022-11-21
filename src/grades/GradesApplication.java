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
                    Student student0 = Students.get("MilesRaker");
                    String output0 = "Name: "+ student0.getName() + " GitHub Username: MilesRaker\nCurrent Average: " + student0.getGradeAverage();
                    System.out.println(output0);
                    break;
                case "LRoar":
                    Student student1 = Students.get("LRoar");
                    String output1 = "Name: "+ student1.getName() + " GitHub Username: LRoar\nCurrent Average: " + student1.getGradeAverage();
                    System.out.println(output1);
                    break;
                case "LEAEL":
                    Student student2 = Students.get("LEAEL");
                    String output2 = "Name: "+ student2.getName() + " GitHub Username: LEAEL\nCurrent Average: " + student2.getGradeAverage();
                    System.out.println(output2);
                    break;
                case "KittenPenny":
                    Student student3 = Students.get("KittenPenny");
                    String output3 = "Name: "+ student3.getName() + " GitHub Username: KittenPenny\nCurrent Average: " + student3.getGradeAverage();
                    System.out.println(output3);
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
