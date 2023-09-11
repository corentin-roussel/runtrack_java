import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class CallableFuture implements Callable<Integer> {
    private int input1;
    private int input2;
    public CallableFuture(Integer input1, Integer input2)
    {
        this.input1 = input1;
        this.input2 = input2;
    }

    public Integer call() throws Exception {
        return input1 * input2;
    }
}
