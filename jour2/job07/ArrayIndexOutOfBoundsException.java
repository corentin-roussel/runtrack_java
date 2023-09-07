import java.util.ArrayList;
import java.lang.*;

public class ArrayIndexOutOfBoundsException {

    public int[] liste = {1,2};

    public void ArrayException() throws java.lang.ArrayIndexOutOfBoundsException
    {
        try{
            int i = liste[3];
        }catch(Exception e)
        {
            System.out.println("Erreur: ArrayIndexOutOfBounds");
        }
    }

}
