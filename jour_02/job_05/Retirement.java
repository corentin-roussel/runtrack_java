package job_05;
import java.util.Scanner;

public class Retirement {
    public static void main(String args[])
    {
        Scanner ageScanner = new Scanner(System.in);

        System.out.println("Enter your age : ");

        int age = ageScanner.nextInt();

        AgeRetirement(age);

        ageScanner.close();
    }

    public static void AgeRetirement(int age)
    {
        if(age >= 67)
        {
            
            System.out.println("You're retired");
        }
        else if(age > 55)
        {
            System.out.println("You're gonna have a hard time finding a job");
        }
        else if(age <= 16)
        {
            System.out.println("You can't work");
        }
        else 
        {
            System.out.println("You're good to work!!");
        }
    }
}
