import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamMap {

    ArrayList<String> liste = new ArrayList<>();
    ArrayList <String> result;
    public StreamMap(String [] array) {
        for(String chaine : array) {
            liste.add(chaine);
        }
    }


    public void changeToUpperCase() {

        result = liste.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));

        for(String str: result)
        System.out.print(str + " ");

    }

}
