package Exercise.ReviewExercise;

import java.util.List;
import java.util.Date;

public class Student {
    private int studentID;
    private String studentName;
    private String studentSurname;
    private Date dateOfBirth;
    private List<Integer> grades;

    public Student(int studentID, String studentName, String studentSurname, Date dateOfBirth, List<Integer> grades) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }

    public Student(List<String> grades) {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public double calculateGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }


    public boolean isExcellent() {
        return (calculateGradeAverage() >= 28);
    }


}

