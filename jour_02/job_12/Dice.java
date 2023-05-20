package job_12;

public class Dice {
    public static void main(String args[])
    {
        int count = 0;
        
        for(int i = 1; i <= 6; i++)
        {
            count++;
            for(int dice1 = 1; dice1 <= 6; dice1++)
            {
                count++;
                for(int dice2 = 1; dice2 <= 6; dice2++)
                {
                    System.out.println("[" +i +"," +dice1 + "," + dice2 +"]");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
