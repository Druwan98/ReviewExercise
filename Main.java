package Exercise.ReviewExercise;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1212442124, "Michele", "Doe", new Date(20 / 1 / 2001), List.of(27, 18, 18));
        Student student2 = new Student(53143132, "John", "Calipso", new Date(11 / 9 / 2001), List.of(28, 27, 16));
        Student student3 = new Student(1212442124, "Elena", "Ricciardi", new Date(23 - 5 - 2000), List.of(17, 16, 17));
        Student student4 = new Student(53344322, "Homer", "Simpson", new Date(17 - 2 - 2002), List.of(27, 18, 2));
        Professor professor1 = new Professor(12451153, "Miquel", "Herman", new Date(20 - 1 - 1970), "Java");
        Professor professor2 = new Professor(62555221, "Mario", "Rossi", new Date(11 - 9 - 1965), "JavaScript");
        System.out.println(student1.calculateGradeAverage());
        System.out.println(student1.isExcellent());
        System.out.println(student2.calculateGradeAverage());
        System.out.println(student2.isExcellent());
        System.out.println(student3.calculateGradeAverage());
        System.out.println(student3.isExcellent());
        System.out.println(student4.calculateGradeAverage());
        System.out.println(student4.isExcellent());
        professor1.assignGrade(student1, 17);
        professor2.assignGrade(student2, 20);
    }
}