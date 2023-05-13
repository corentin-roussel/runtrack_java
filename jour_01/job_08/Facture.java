package jour_01.job_08;

public class Facture {
    public static void main(String args[])
    {
        double price = 49.99;

        int quantity = 3;
        double price_ot, taxe, price_wt; 

        price_ot = price * quantity;

        taxe = price_ot / 100 * 20;

        price_wt = price_ot + taxe;

        

        System.out.println("Le montant total est de : " + price_ot +"$");
        System.out.println("Le montant de la taxe est : " + taxe + "$");
        System.out.println("Le montant de la taxe est : " + price_wt + "$");

    }
}
