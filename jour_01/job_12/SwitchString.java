package jour_01.job_12;
import java.util.Scanner;

public class SwitchString {
    public static void main(String args[])
    {
        Scanner string = new Scanner(System.in);

        System.out.println("Enter a string : ");

        String string1 = string.nextLine();

        System.out.println("Enter a string : ");

        String string2 = string.nextLine();

        System.out.println("The string1 is equal to : " +string1+" the string 2 is equal to " + string2);

        string1 = string1 + string2;

        string2 = string1.substring(0, (string1.length() - string2.length()));

        string1 = string1.substring(string2.length());

        System.out.println("The string1 is equal to : " +string1+" the string 2 is equal to " + string2);

        string.close();

    }
}
