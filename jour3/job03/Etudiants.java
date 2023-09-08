import java.util.HashMap;
import java.util.Map;

public class Etudiants {

    Map<Integer, String> etudiant = new HashMap<>();

    public void addEtudiant()
    {
        etudiant.put(101, "Anaïs");
        etudiant.put(102, "Fabien");
        etudiant.put(103, "Corentin");
        etudiant.put(104, "Amine");


        etudiant.forEach((k, v) -> System.out.println(k +": " + v));

    }

}
