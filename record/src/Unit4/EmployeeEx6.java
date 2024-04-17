package Unit4;

class EmpSalaryException extends Exception {
    EmpSalaryException(String errorMessage) {
        super(errorMessage);
    }
}

class Employee {

    private String name;
    private int age;
    private double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void validate() throws EmpSalaryException {

        if (salary < 1000) {
            throw new EmpSalaryException(name + "'s salary should be more than 1000");
        } else {
            System.out.println("Salary Verified");
        }
    }

}

public class EmployeeEx6 {

    public static void main(String[] args) {
        Employee e1 = new Employee("kani", 20, 10000.0);
        Employee e2 = new Employee("kumaar", 20, 500.0);
        
        try {
            e1.validate();
            e2.validate();
        } catch (Exception e) {
            if (e instanceof EmpSalaryException) {
                System.out.println(e);
            }
        }
    }
}