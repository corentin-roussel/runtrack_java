package job5;
import java.util.Random;

public class JeuDeDes {

    public static Random rand = new Random();
    public static int dice1 = rand.nextInt(6 - 1 + 1) +1;
    public static int dice2 = rand.nextInt(6 - 1 + 1) +1;

    public static void main(String[] args)
    {
        System.out.println("Dé 1: " + dice1);
        System.out.println("Dé 2: " + dice2);

        add();
    }

    public static void add()
    {
        System.out.print("Somme: ");
        System.out.println(dice1 + dice2);
    }
}
