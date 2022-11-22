package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        /************************* Initialize Students HashMap *************************/
        HashMap<String, Student> Students = new HashMap<>();

        // create students
        Student Miles = new Student("Miles");
        Student Laura = new Student("Laura");
        Student Lea = new Student("Lea");
        Student Penny = new Student("Penny");

        // add grades
        Miles.addGrade(100);
        Miles.addGrade(99);
        Miles.addGrade(98);

        Laura.addGrade(99);
        Laura.addGrade(98);

        Lea.addGrade(100);
        Lea.addGrade(99);
        Lea.addGrade(98);

        Penny.addGrade(100);
        Penny.addGrade(99);
        Penny.addGrade(98);

        //add attendance
        Miles.recordAttendance("11051986", "P");
        Miles.recordAttendance("11051987", "P");
        Miles.recordAttendance("11051988", "P");
        Miles.recordAttendance("11051989", "P");
        Miles.recordAttendance("11051990", "P");
        Miles.recordAttendance("11051991", "P");
        Miles.recordAttendance("11051991", "A");

        Laura.recordAttendance("12311980", "P");
        Laura.recordAttendance("12311981", "P");
        Laura.recordAttendance("12311982", "P");
        Laura.recordAttendance("12311983", "P");
        Laura.recordAttendance("12311984", "P");

        Lea.recordAttendance("07122010", "P");
        Lea.recordAttendance("07122011", "P");
        Lea.recordAttendance("07122012", "P");
        Lea.recordAttendance("07122013", "A");
        Lea.recordAttendance("07122014", "P");
        Lea.recordAttendance("07122015", "P");

        Penny.recordAttendance("11052010", "P");
        Penny.recordAttendance("11052011", "P");
        Penny.recordAttendance("11052012", "P");
        Penny.recordAttendance("11052013", "P");
        Penny.recordAttendance("11052014", "P");
        Penny.recordAttendance("11052015", "P");
        // add to hashmap
        Students.put("MilesRaker", Miles);
        Students.put("LRoar", Laura);
        Students.put("LEAEL", Lea);
        Students.put("KittenPenny", Penny);

        /************************* Command Line Interface *************************/
        Input in = new Input();
        System.out.println("GRADES APPLICATION -- START..");
        System.out.println("******************************");
        System.out.println();

        while(true){
            System.out.println("Enter Student Username to see Student Details: ");
            System.out.println("MilesRaker | LRoar | LEAEL | KittenPenny");
            System.out.println("Or enter oen of the following commands: ");
            System.out.println("Exit | classAverage | csvReport");


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
                case "Exit":
                    return;
                case "classAverage":
                    break;
                case "csvReport":
                    System.out.println("Students Data CSV Report: ");
                    System.out.println("name,github_username,average");
                    Students.forEach((key, value) -> {
                        System.out.println(value.toCsv(key));
                    });
                    System.out.println("-----End csv report-----\n\n");
                    break;
                default:
                    System.out.println("invalid username");
                    break;
            }
        }
    }
}
