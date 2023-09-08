import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperation {

    ArrayList<Integer> number = new ArrayList<>();

    public StreamsOperation(Integer... params)
    {
        for(Integer num: params)
        {
            number.add(num);
        }
    }

    public void useStream()
    {
        ArrayList<Integer> newNum = (ArrayList<Integer>) number.stream()
                                            .map(num -> num*2)
                                            .filter(num -> num < 10)
                                            .collect(Collectors.toList());

        System.out.println(newNum);
    }
}
