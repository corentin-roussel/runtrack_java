public class Synchronization extends Thread {

    public int solde;

    public int ret;


    public Synchronization(int solde)
    {
        this.solde = solde;
    }

    public synchronized void retrieve(int ret)
    {
        this.solde -= ret;
        System.out.println(Thread.currentThread().getName() + " a retiré " + ret + "€");
    }

    public synchronized int getSolde()
    {
        return solde;
    }


}
