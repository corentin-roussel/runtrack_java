package job_03;
import java.util.Scanner;

public class MultiplyTable {
    public static void main(String args[])
    {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Enter a number to choose your multiply table : ");

        int inputNumber = numberScanner.nextInt();

        for(int i = 0; i <= 10; i++)
        {
            int result = i * inputNumber;

            System.out.println(i +"x"+ inputNumber + "=" + result);
        }

        numberScanner.close();
    }
}
