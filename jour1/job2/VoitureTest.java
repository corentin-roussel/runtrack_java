package job2;

public class VoitureTest {


    public static int speed = 0;
    public static boolean state = false;
    public static void main(String[] args)
    {
        state = stateChange(state);

        speed = speedInc(state, speed);
        System.out.println("La vitesse est de maintenant " + speed + " km/h");

        speed = speedInc(state, speed);
        System.out.println("La vitesse est de maintenant " + speed + " km/h");

        state = stateChange(state);

    }

    public static boolean stateChange(boolean state)
    {


        if(!state)
        {
            System.out.println("La voiture démarre");
            state = true;
        }
        else if (state)
        {
            System.out.println("La voiture s'arrête. Vitesse réinitialisé a 0 km/h");
            state = false;
        }

        if(!state)
        {
            speed = 0;
        }

        return state;
    }

    public static int speedInc(boolean state, int speed)
    {
        if(state)
        {
            speed += 10;
        }

        return speed;
    }


}
