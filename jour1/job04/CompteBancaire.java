package job04;
import java.util.Scanner;

public class CompteBancaire {

    public static int solde = 100;

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {

        affichage();

        depot();

        retrait();
        retrait();

    }

    public static void retrait()
    {
        System.out.println("Combien voulez vous retiré: ");
        int ret = input.nextInt();
        if(solde > ret)
        {

            solde = solde - ret;
            System.out.println(ret + " retirés. Nouveau solde: " + solde);
        }
        else
        {
            System.out.println("Tentative de retrait de " + ret + "... Solde insuffisant.");
        }

    }

    public static void affichage()
    {
        System.out.println("Solde actuel: " + solde);
    }
    public static void depot()
    {
        System.out.println("Combien voulez vous déposé: ");
        int depot = input.nextInt();

        solde = solde + depot;

        System.out.println(depot +" déposés. Nouveau solde: " + solde);

    }

}
