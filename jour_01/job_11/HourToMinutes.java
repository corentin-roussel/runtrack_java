package jour_01.job_11;
import java.util.Scanner;

public class HourToMinutes {

    public static void main(String args[])
    {
        Scanner minutesScanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter a duration in minutes : ");
        int inputMinutes = minutesScanner.nextInt();

        int hour = inputMinutes / 60;
        int minute = inputMinutes % 60;

        System.out.println(inputMinutes + " is the equivalent of " +hour+ " hours " +minute+ " minutes.");

        minutesScanner.close();
    }
    
}
