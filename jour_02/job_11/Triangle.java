package job_11;
import java.util.Scanner;

public class Triangle {
    public static void main(String args[])
    {
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("Enter the height of the triangle : ");

        int inputHeight = userInputScanner.nextInt();

        int row;

        int column;

        //column = 1;



        // while(column <= inputHeight)
        // {
        //     row = 1;
        //     while(row <= column)
        //     {
        //         System.out.print("*");
        //         row++;
        //     }
        //     column++;
        //     System.out.println();
        // }

        for(column = 1; column <= inputHeight; column++ )
        {
            for(row = 1; row <= column; row ++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }



        userInputScanner.close();
    }
}
