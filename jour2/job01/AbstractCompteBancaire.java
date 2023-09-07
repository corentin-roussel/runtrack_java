abstract class AbstractCompteBancaire {

    public static float solde_courant = 100;
    public static float ret = 90;
    public static float depot = 50;
    public static float solde_epargne = 200;
    public static float taux = 2;

    public static void retrait()
    {
        if(solde_courant > ret)
        {
            solde_courant = solde_courant - ret;
            System.out.println(ret + " retirés. Nouveau solde: " + solde_courant +"€");
        }
        else
        {
            System.out.println("Tentative de retrait de " + ret + "... Solde insuffisant.");
        }

    }

    public static void affichage()
    {
        System.out.println("Solde du compte courant: " + solde_courant + "€");
        System.out.println("Solde du compte épargne: " + solde_epargne + "€ avec un taux d'intérét de "+ taux + "%");
    }
    public static void depot()
    {
        solde_courant = solde_courant + depot;

        System.out.println(depot +" déposés. Nouveau solde: " + solde_courant+"€");

    }

    public static void epargne()
    {
        float interet = solde_epargne * ( taux / 100);
        solde_epargne =  solde_epargne + interet;

        System.out.println("Intérêts ajoutés: "+interet+"€. Nouveau solde: "+ solde_epargne);

    }

}