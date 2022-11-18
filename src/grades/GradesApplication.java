package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
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
    }
}
