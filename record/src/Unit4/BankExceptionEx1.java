package Unit4;

import java.util.Scanner;

class InvalidNameException extends Exception {

    InvalidNameException(String errorMessage) {
        super(errorMessage);
    }
}

class InvalidJobException extends Exception {

    InvalidJobException(String errorMessage) {
        super(errorMessage);
    }
}

class InvalidAgeException extends Exception {

    InvalidAgeException(String errorMessage) {
        super(errorMessage);
    }
}

public class BankExceptionEx1 {
    static void validateName(String name) throws InvalidNameException {
        if (name == null) {

            // throw an object of user defined exception
            throw new InvalidNameException("Name should not be null");
        } else {
            System.out.println("Name Verified");
        }
    }

    static void validateJob(String job) throws InvalidJobException {
        if (job.equalsIgnoreCase("Associate") || job.equalsIgnoreCase("Clerk") || job.equalsIgnoreCase("Officer")
                || job.equalsIgnoreCase("Executive")) {
            System.out.println("Job Verified");
        } else {
            throw new InvalidJobException("Job should not be" + job);
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (18 <= age && age <= 30) {
            System.out.println("Age Verified");
        } else {
            throw new InvalidAgeException("Age should be between 18 and 30");
        }
    }

    public static void main(String[] args) throws InvalidNameException, InvalidJobException, InvalidAgeException {
        String name, job;
        int age;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = scan.nextLine();
        System.out.println("Enter Job: ");
        job = scan.nextLine();
        System.out.println("Enter Age: ");
        age = scan.nextInt();

        

        validateName(name);
        validateJob(job);
        validateAge(age);
        scan.close(); 
    }
}