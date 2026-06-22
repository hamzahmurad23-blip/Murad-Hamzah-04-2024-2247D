import javax.naming.Name;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;
public class StudentRecords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String fullname, indexnumber, department, level, gender;
        double gpa;
        int age;

        System.out.println("Enter Full Name:");
        fullname = input.nextLine();
        System.out.println("Enter Index Number:");
        indexnumber = input.next();
        System.out.println("Enter Department:");
        input.nextLine();
        department = input.nextLine();
        System.out.println("Enter Level:");
        level = input.next();
        System.out.println("Enter GPA:");
        gpa = input.nextDouble();
        System.out.println("Gender");
        gender = input.next();
        System.out.println("Enter Age:");
        age = input.nextInt();


        //Display Student Profile
        System.out.println("\n===== STUDENT PROFILE =====");
        System.out.println("Full Name: " + fullname);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Index Number: " + indexnumber);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.println("GPA: " + gpa);

        //Determine Academic Classification
        double Gpa;

        if (gpa >= 4.5)
        {
            System.out.println("Academic Class: First Class");
        }
        else if (gpa >= 3.5)
        {
            System.out.println("Academic Class: Second Class Upper");
        }
        else if (gpa >= 2.5)
        {
            System.out.println("Academic Class: Second Class Lower");
        }
        else
        {
            System.out.println("Academic Class: Pass");
        }

        //Determine Adult Status
        int Age;

        if (age >= 18)
            System.out.println("Adult Status: YES");
        else
            System.out.println("Minor Status: NO");

        System.out.println("========================");






    }
}
