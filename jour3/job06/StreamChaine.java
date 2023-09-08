import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamChaine {

    ArrayList<String> chaine = new ArrayList<>();

    public StreamChaine(String... params)
    {
        for(String num : params)
        {
            chaine.add(num);
        }

    }

    public void chaine()
    {
        String result = chaine.stream()
                .filter(str -> str.length() == 3)
                .filter(str -> str.charAt(0) == 'a')
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

}
