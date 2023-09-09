package Exercise.ReviewExercise;

import java.util.Date;

public class Professor {
    int professorID;
    String professorName;
    String professorSurname;
    Date dateOfBirth;
    String courseTaught;

    public int getProfessorID() {
        return professorID;
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorSurname() {
        return professorSurname;
    }

    public void setProfessorSurname(String professorSurname) {
        this.professorSurname = professorSurname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }


    public Professor(int professorID, String professorName, String professorSurname, Date dateOfBirth, String courseTaught) {
        this.professorID = professorID;
        this.professorName = professorName;
        this.professorSurname = professorSurname;
        this.dateOfBirth = dateOfBirth;
        this.courseTaught = courseTaught;
    }

    public Professor(int professorID, String professorName, String professorSurname, Date dateOfBirth) {
        this.professorID = professorID;
        this.professorName = professorName;
        this.professorSurname = professorSurname;
        this.dateOfBirth = dateOfBirth;
    }

    public void assignGrade(Student s, int grade) {
        if (grade >= 18) {
            System.out.println(s.getStudentName() + " = Exam passed with grade " + grade);
        } else {
            System.out.println(s.getStudentName() + " = Exam failed");
        }

    }


}
