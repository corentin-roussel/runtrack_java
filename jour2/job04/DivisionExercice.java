
public class DivisionExercice extends AbstractDivision {



    public static void main(String[] args) {
        checkDivisionByZero();
    }

    public static void checkDivisionByZero()
    {

        System.out.println();
        if(number2 == 0)
        {
            throw new IllegalArgumentException("Erreur: Division par zéro");
        }
        else
        {
            System.out.println(divide());
        }
    }







}
