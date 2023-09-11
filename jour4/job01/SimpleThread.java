public class SimpleThread extends Thread {

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Salut du thread!");
            try{
                SimpleThread.sleep(1000);
            }catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }

        }
    }

}
