// Find and return the average salary, number of salaries greater than the average salary and number of salaries lesser than the average salary from the salary array passed to the findDetails() method. Return a double array containing average salary in index position 0, number of salaries greater than the average salary in index position 1 and number of salaries lesser than the average salary in index position 2. Implement the logic inside findDetails() method.

// Test the functionalities using the main method of the Tester class.


public class App {
    public static double[] findDetails(double[] salary) {
        int highCount = 0,lowCount = 0;
        double avg = 0;

        for (double sal : salary) {
            avg += sal;
        }
        avg /= salary.length ;

        for (double sal : salary) {
            if (sal > avg) {
                highCount ++;
            } else if (avg > sal) {
                lowCount ++;
            }
        }
        //Implement your code here and change the return value accordingly
        double[] detail = {avg,highCount,lowCount};
        return detail;     

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
