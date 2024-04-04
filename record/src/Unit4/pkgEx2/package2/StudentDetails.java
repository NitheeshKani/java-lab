package Unit4.pkgEx2.package2;

import Unit4.pkgEx2.package1.Student;

public class StudentDetails {

    public static void main(String[] args) {

        Student s = new Student(39,"Nitheesh", 98, 100);
        display(s);
        calculatePercentage(s);
        
    }

    static void display(Student s) {
        System.out.println("Student Id: " + s.getStudentId());
        System.out.println("Student Name: " + s.studentName);
        System.out.println("Mark Obtained: " + s.getMarkObtained());
        System.out.println("Total Marks: " + s.totalMarks);
    }
    static void calculatePercentage(Student s) {
        System.out.println("Percentage: " + (s.getMarkObtained() / s.totalMarks) * 100);
    }
}
