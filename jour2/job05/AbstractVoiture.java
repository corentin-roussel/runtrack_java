public abstract class AbstractVoiture {



        public static int speed = 0;
        public static boolean state = false;

        public static void stateChange()
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
        }

        public static void speedInc()
        {
            if(state)
            {
                speed += 100;
                System.out.println("La vitesse est de maintenant " + speed + " km/h");
            }else{
                System.out.println("La vitesse est de maintenant " + speed + " km/h");
            }


        }

        public static void limitationSpeed() throws ExceptionLimiteVitesse
        {
            if(speed > 100){
                throw new ExceptionLimiteVitesse();
            }
        }


    }