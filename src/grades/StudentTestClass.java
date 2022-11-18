package grades;

public class StudentTestClass {
    public static void main(String[] args) {

        // Testing Student class
        Student Miles = new Student("Miles");
        Miles.addGrade(100);
        Miles.addGrade(100);
        Miles.addGrade(99);
        System.out.println("Miles.getName() = " + Miles.getName());
        System.out.println("Miles.getGradeAverage() = " + Miles.getGradeAverage());


    }
}
