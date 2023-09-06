package job1;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Veuillez saisir votre nom: ");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }

}
