import javax.naming.Name;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;
public class StudentRecords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String fullname, indexnumb, department, level;
        double gpa;
        int age;

        System.out.println("Enter Full Name:");
        input.next();
        fullname = input.nextLine();
        System.out.println("Enter Index Number:");
        indexnumb = input.next();
        System.out.println("Enter Department:");
        input.next();
        input.next();
        department = input.next();
        System.out.println("Enter Level:");
        level = input.next();
        System.out.println("Enter GPA:");
        gpa = input.nextDouble();
        System.out.println("Enter Age:");
        age = input.nextInt();


        //Display Student Profile
        System.out.println("\n===== STUDENT PROFILE =====");
        System.out.println("Full Name: " + fullname);
        System.out.println("Age: " + age);
        System.out.println("Index Number: " + indexnumb);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.println("GPA: " + gpa);

        //Determine Academic Classification
        double Gpa;

        if (gpa >= 4.5)
        {
            System.out.println("First Class");
        }
        else if (gpa >= 3.5)
        {
            System.out.println("Second Class Upper");
        }
        else if (gpa >= 2.5)
        {
            System.out.println("Second Class Lower");
        }
        else
        {
            System.out.println("Pass");
        }

        //Determine Adult Status
        int Age;

        if (age >= 18)
            System.out.println("Adult");
        else
            System.out.println("Minor");








    }
}
