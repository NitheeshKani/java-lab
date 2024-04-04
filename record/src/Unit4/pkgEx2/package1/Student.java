package Unit4.pkgEx2.package1;
// Run from "package2/StudentDetails.java"

public class Student {
    private int studentId;
    private float markObtained;
    
    public String studentName;
    public float totalMarks;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setMarkObtained(float markObtained) {
        this.markObtained = markObtained;
    }

    public float getMarkObtained() {
        return markObtained;
    }

    public Student(int studentId, String studentName, float markObtained, float totalMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.markObtained = markObtained;
        this.totalMarks = totalMarks;
    }
}
