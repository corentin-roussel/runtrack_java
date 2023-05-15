package job_06;

public class SumEvenNumber {
    
    public static void main(String args[])
    {
        int i;
        int result = 0;
        for( i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                
                result = result + i;
            }
        }

        System.out.println("La somme des nombres de 1 a 100 est : "+ result);
    }
}
