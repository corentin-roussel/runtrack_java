package jour_01.job_10;
import java.util.Scanner;

public class FullName {
    public static void main(String args[])
    {
        Scanner name = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your firstname");

        String firstName = name.nextLine();  // Read user input

        System.out.println("Enter your lastname");

        String lastName = name.nextLine();  // Read user input

        System.out.println("Your full name is : " + firstName +" "+ lastName);  // Output user input

        name.close();
    }
}
