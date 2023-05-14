package job_03;
import java.util.Scanner;

public class MultiplyTable {
    public static void main(String args[])
    {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Veuillez entrez un chiffre pour choisir votre table de multiplication : ");

        int inputNumber = numberScanner.nextInt();

        for(int i = 0; i <= 10; i++)
        {
            int result = i * inputNumber;

            System.out.println(i +"x"+ inputNumber + "=" + result);
        }

        numberScanner.close();
    }
}
