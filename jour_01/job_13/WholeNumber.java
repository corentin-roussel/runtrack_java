package jour_01.job_13;
import java.util.Scanner;

public class WholeNumber {
    public static void main(String args[])
    {
        Scanner integer = new Scanner(System.in);

        System.out.println("Enter a whole number : ");

        int inputInt = integer.nextInt();

        int i = 1;

        while(i <= inputInt)
        {
            System.out.println(i);
            i++;
        }

        integer.close();


    }
}
