import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetArgument {

    public HashSet<String> hash = new HashSet<>();

    public void fillHashSet(String [] animals) {

        for(String i: animals) {
             hash.add(i);
        }


        for(String animal: hash) {
            System.out.println(animal);
        }
    }
}
