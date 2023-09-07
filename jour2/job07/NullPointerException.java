

public class NullPointerException {

    public String name = null;
    public void exceptionNullPointer()
    {

        try{
            char i = name.charAt(4);
        }catch(Exception e)
        {
            System.out.println("Erreur: NullPointerExecution");
        }

    }
}
