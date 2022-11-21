package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    };
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
}
