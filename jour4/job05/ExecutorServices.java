import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorServices {


    public void threadPool()
    {
        ExecutorService executor =  Executors.newFixedThreadPool(5);

        for(int i = 1; i <= 3; i++)
        {
            int factor = i;

            executor.submit(() -> multiply(factor, 3));
        }

        executor.shutdown();
    }

    public void multiply(int factor, int input2) {
        System.out.println("Résultat de la tâche"+factor+":" + factor * input2);
    }
}