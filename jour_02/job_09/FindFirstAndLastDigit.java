package job_09;

public class FindFirstAndLastDigit {
    public static void main(String args[])
    {
        int number = 1234;

        char[] digits = String.valueOf(number).toCharArray();

        

        int count = 0;

        while(number != 0)
        {
            number /= 10;
            count++;
        }

        for(int i = 0; digits[i] != 0 ; i++)
        {   
            if(i == 0)
            {
                System.out.println(digits[i]);
            }
            if(i == count-1)
            {
                System.out.println(digits[i]);
                break;
            }
        }
    }
}
