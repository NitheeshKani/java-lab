package Unit3;

interface DataProvider {
    int totalMaxMark = 8000;
    void calcPercentage();
}

class Intern implements DataProvider {
    int markSecured;
    int graceMarks;

    Intern(int markSecured, int graceMarks) {
        this.markSecured = markSecured;
        this.graceMarks = graceMarks;
    }
    public void calcPercentage() {
        System.out.println("Percentage secured: " + ((markSecured + graceMarks) * 100) / (totalMaxMark));
    }
}

 class Trainee implements DataProvider {
    int markSecured;

    Trainee(int markSecured) {
        this.markSecured = markSecured;
    }
    public void calcPercentage() {
        System.out.println("Percentage secured: " + ((markSecured) * 100) / (totalMaxMark));
    }
}

public class InterfaceDataEx9 {
    public static void main(String[] args) {
        Intern i = new Intern(5000, 1000);
        i.calcPercentage();
        Trainee t = new Trainee(5600);
        t.calcPercentage();
    }
}
