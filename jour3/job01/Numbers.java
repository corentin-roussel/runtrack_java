import java.util.*;
public class Numbers {

    public ArrayList<Integer> numbers = new ArrayList<Integer>();
    public Numbers(int nbNombres)
    {

        for(int i = 1; i <= nbNombres; i++)
        {
            numbers.add(i);
        }
    }
    public int findEven() {

        int result = 0;

        for(Integer i: numbers)
        {
            if(i%2 == 0)
            {
                result += i;
            }
        }

        return result;

    }
}
