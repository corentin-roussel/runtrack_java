import java.util.ArrayList;
import java.util.Collections;

public class ListeAnimal {

    public ArrayList<String> liste = new ArrayList<>();
    public String listeTrier = "";


    public String animal()
    {
        liste.add("Chien");
        liste.add("Chat");
        liste.add("Chat");
        liste.add("Chien");
        liste.add("Oiseau");
        liste.add("Poisson");


        for(String word : liste)
        {
            int frequency = Collections.frequency(liste, word);

            if (frequency == 1) {

                listeTrier += word + ", ";
            }
        }
        listeTrier = "Mots uniques: " + listeTrier.substring(0, 15);

        return listeTrier;
    }


}
