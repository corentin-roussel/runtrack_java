import java.util.ArrayList;

public class ArrayListArgument {

    public ArrayList<String> list = new ArrayList<>();

    public String fillList(String... params)
    {
        for(int i = 0; i < params.length; i++)
        {
            list.add(params[i]);

        }
        String listString = String.join("\n", list);
        return listString;
    }

}
