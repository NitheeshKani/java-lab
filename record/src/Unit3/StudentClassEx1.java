package Unit3;

class Student {

    private String rollno;

    void setRollno(String rollno) {
        this.rollno = rollno;
    }

    String getRollno() {
        return rollno;
    }

}
class Test extends Student {

    private int marks1, marks2;

    public void setMarks(int marks1, int marks2) {
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public int[] getMarks() {
        int[] marks = { marks1, marks2 };
        return marks;
    }
}

class Result extends Test {

    public int total() {
        return getMarks()[0] + getMarks()[1];
    }

    public void display() {
        System.out.println("Student details:");
        System.out.println("Rollno: " + getRollno());
        System.out.println("Marks: ");
        for (int i = 0; i < getMarks().length; i++)
            System.out.print(getMarks()[i] + " ");
        System.out.println();
        System.out.println("Total: " + total());
    }
}

public class StudentClassEx1 {
    public static void main(String[] args) {

        Result r = new Result();
        r.setRollno("22CD039");
        r.setMarks(100, 150);
        r.display();
    }
}
