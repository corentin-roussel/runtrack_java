public class RunnableInterface implements Runnable {

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("En cours d'éxecution");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
