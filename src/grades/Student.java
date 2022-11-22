package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        attendance = new HashMap<>();
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
        double present = 0;
        double total = attendance.size();
        for( String value: attendance.values()){

            if(value.equalsIgnoreCase("P")){
                present++;
            }
        }
        return present/total*100;
    }

    public ArrayList<String> absenceReport(){
        ArrayList<String> report = new ArrayList<>();
        for( String key: attendance.keySet()){
            if(attendance.get(key).equalsIgnoreCase("A")){
                report.add(key);
            }
        }
        return report;
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
        StringBuilder output = new StringBuilder("Name: " + name + "\nGrade Average: " + getGradeAverage() + "\nAttendance Percentage: " + calculateAttendance() + "\n");
        output.append("Individual assignment grades: \n");
        for (Integer grade : grades) {
            output.append("Grade: ").append(grade).append("\n");
        }
        ArrayList<String> absenceReport = absenceReport();
        output.append("\n Absence Report:\n");
        for (String i : absenceReport) {
            output.append(i + "\n");
        }
        return output.toString();
    }

    public String toCsv(String gitName){
        return  name + "," + gitName + "," + getGradeAverage() ;
    }

/*    public static void main(String[] args) {
        Student Miles = new Student("Miles");
        Miles.recordAttendance("11051986","P");
        Miles.recordAttendance("11061986","P");
        Miles.recordAttendance("11071986","P");
        Miles.recordAttendance("11081986","P");
        Miles.recordAttendance("11091986","P");
        Miles.recordAttendance("11101986","A");
        System.out.println("Miles.calculateAttendance() = " + Miles.calculateAttendance());
    }*/
}
