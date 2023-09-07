public class VoitureExercice extends AbstractVoiture {

    public static void main(String[] args) {

        try{
            stateChange();
            speedInc();
            speedInc();
            limitationSpeed();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
