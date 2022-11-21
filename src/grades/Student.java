package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public void setAttendance(HashMap<String, String> attendance) {
        this.attendance = attendance;
    }

    private HashMap<String, String> attendance;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    };

    /**recordAttendance
     * Adds records to the attendance Hashmap
     * @param date is a date in format 2017-10-02
     * @param status is either "A" for absent or "P" for present*/
    public void recordAttendance(String date, String status){
        if(status.equalsIgnoreCase("A") || status.equalsIgnoreCase("P")){
            attendance.put(date, status);
        } else{
            System.out.println("Error in recordAttendance()");
        }
    }

    /**calculateAttendance
     * @return attendance rate in %*/
    public double calculateAttendance(){
/*        int present = 0;
        int total = attendance.size();
        System.out.println(total);
        for( : attendance)
        attendance.forEach((date, status) -> {
            if(status.equalsIgnoreCase("P")){
                //present++;
            }
        });*/
        return 30.0;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return (total / grades.size());
    };

    public String toString(){
        StringBuilder output = new StringBuilder("Name: " + name + "\nGrade Average: " + getGradeAverage() + "\n");
        output.append("Individual assignment grades: \n");
        for (Integer grade : grades) {
            output.append("Grade: ").append(grade).append("\n");
        }
        return output.toString();
    }

    public String toCsv(String gitName){
        return  name + "," + gitName + "," + getGradeAverage() ;

    }

    public static void main(String[] args) {
        Student Miles = new Student("Miles");
    }
}
