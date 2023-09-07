package job03;
import java.util.Scanner;

public class Calculatrice {
    public static float number1;
    public static float number2;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier nombre: ");
        number1 = scanner.nextInt();

        System.out.println("Entrez le deuxiéme nombre: ");
        number2 = scanner.nextInt();

        add();

        substract();

        multiply();

        divide();

        scanner.close();

    }

    public static void add()
    {
        System.out.print("Addition: ");
        System.out.println(number1 + number2);
    }

    public static void substract()
    {
        System.out.print("Soustraction: ");
        System.out.println(number1 - number2);
    }
    public static void multiply()
    {
        System.out.println("Multiplié: " + number1 * number2);
    }
    public static void divide()
    {
        System.out.println("Division: " + number1 / number2);
    }

}
