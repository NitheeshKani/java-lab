import java.util.Scanner;

public class Student {
    
    String name;
    int age;

    Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        name = scan.nextLine();
        System.out.println("Age");
        age = scan.nextInt();
        scan.close();
    }
    Student(String n,int a){
        name = n;
        age = a;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
