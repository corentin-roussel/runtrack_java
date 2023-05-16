package job_07;

import java.util.Scanner;

class Factorial {
    public static void main(String args[])
    {
        Scanner inputInt = new Scanner(System.in);

        System.out.println("Please enter a number to find the factorial : ");

        int factorial = inputInt.nextInt();
        int result = factorial;
        int i = factorial;

        while(i >= 1)
        {
            
            i--;   
            if(i == 0)
            {
                break;
            }
            
            result += result * (i-1);
        }

        System.out.println("La factorielle du nombre " + factorial + " est " + result);

        inputInt.close(); 
    }
}
