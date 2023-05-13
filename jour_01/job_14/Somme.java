package jour_01.job_14;
import java.util.Scanner;


public class Somme {
    public static void main(String args[])
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Veuillez entre un chiffre : ");

        int num1 = inputScanner.nextInt();

        System.out.println("Veuillez entre un chiffre : ");

        int num2 = inputScanner.nextInt();

        System.out.println(num1+num2);

        inputScanner.close();
    }
}
