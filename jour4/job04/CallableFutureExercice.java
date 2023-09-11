import java.util.concurrent.*;
public class CallableFutureExercice {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> call = new CallableFuture(2,5);

        Future<Integer> future = executor.submit(call);
        try{
            System.out.println(future.get());

        }catch(ExecutionException | InterruptedException e){
            System.out.println("Erreur: Erreur d'éxecution ou d'interruption");
        }

        executor.shutdown();
    }
}
