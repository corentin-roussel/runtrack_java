import java.util.HashMap;

public class HashMapArgument {

    public HashMap<String,String> map = new HashMap<>();

    public void fillHashMap(String[] params) {

        for(int i = 0; i < params.length; i+= 2) {
            map.put(params[i], params[i+1]);
        }

        map.forEach((k, v) -> System.out.println(k +": " + v));

    }
}
