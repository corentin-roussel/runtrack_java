package job_08;
import java.util.Scanner;

public class CountNumber {
    public static void main(String args[])
    {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Please enter a number : ");

        int number = inputNumber.nextInt();

        int count = 0;

        while(number != 0)
        {
            number = number /10;

            count++;
        }

        System.out.println("The length of this number is : " + count );

        inputNumber.close();
    }
}
