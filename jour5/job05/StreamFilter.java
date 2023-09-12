import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public ArrayList<Integer> liste = new ArrayList<>();
    public ArrayList<Integer> result;

    public StreamFilter(String [] array) {
        for (String num : array) {
            liste.add(Integer.parseInt(num));
        }

    }

    public void streamBig() {

        result = liste.stream()
                .filter(n -> n > liste.get(0))
                .collect(Collectors.toCollection(ArrayList::new));




        System.out.print("Nombre supérieurs a " + liste.get(0) + ": ");
        for(Integer num: result) {
            System.out.print(num + " ");
        }

    }
}
