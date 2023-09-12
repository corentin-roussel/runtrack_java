public class SynchronizationExercice {

    public static void main(String[] args) {

        Synchronization sync = new Synchronization(Integer.parseInt(args[0]));

        Thread thread1 = new Thread(() -> sync.retrieve(Integer.parseInt(args[1])));
        Thread thread2 = new Thread(() -> sync.retrieve(Integer.parseInt(args[1])));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Il vous reste " + sync.getSolde() + "€");
    }
}
