package job_10;

public class AddTheWholeNumber {
    public static void main(String args[])
    {
        int number = 1234;
        String temp = Integer.toString(number);
        int[] digits = new int[temp.length()];



        for (int i = 0; i < temp.length(); i++) {
            digits[i] =  Character.getNumericValue(temp.charAt(i));
        }

        int result = 0;

        for(int j = 0; j< temp.length()  ; j++)
        {   
            result +=  digits[j];
            
        }

        System.out.println(result);
    }
}
