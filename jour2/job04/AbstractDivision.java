
public abstract class AbstractDivision {

    public static int number1 = 10;
    public static int number2 = 0;
    public static float divide() throws ExceptionByZero
    {
        if(number2 == 0)
        {
            throw new ExceptionByZero();
        }
            return (float) number1 / number2;
    }
}
