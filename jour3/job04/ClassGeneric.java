import java.util.ArrayList;

public class ClassGeneric <Type>{


    ArrayList<Type> boite = new ArrayList<>();
    public void addElement(Type... params)
    {
        for(Type one: params)
        {
            boite.add(one);
        }
        System.out.println("Contenu de la boite: "+boite);
    }

    public void retrieve(Type... params)
    {
        boite.clear();
        System.out.println("Contenu de la boite: "+boite);
    }


}
