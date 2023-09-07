
public class ArithmeticException {

    public void arithmeticException()
    {
        try{
            float divide = 10/0;
        }catch(Exception e){
            System.out.println("Erreur: ArithmeticException");
        }
    }
}
