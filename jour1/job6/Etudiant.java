package job6;
import java.util.*;

public class Etudiant {

    public String name;

    public ArrayList<Integer> notes = new ArrayList<Integer>();

    public Scanner input = new Scanner(System.in);

    public float moyenne;

    public Etudiant(String name) {
        this.name = name;
    }



    public static void main(String[] args)
    {

        Etudiant etudiant1 = new Etudiant("Bob");


        etudiant1.notes.add(15);
        etudiant1.notes.add(19);
        etudiant1.notes.add(4);
        etudiant1.notes.add(8);
        etudiant1.notes.add(12);
        etudiant1.AddNotes();

        int arrSize = etudiant1.notes.size();

        for (int i = 0; i < arrSize; i++)
        {
            etudiant1.moyenne += etudiant1.notes.get(i);
        }



        System.out.println("Nom de l'étudiant: " + etudiant1.name);
        System.out.println("Notes: " + etudiant1.notes);
        etudiant1.MaxElement();
        etudiant1.MinElement();
        System.out.println("Moyenne: " + etudiant1.moyenne / arrSize);
    }

    public void AddNotes()
    {
        System.out.println("Entrer la note de " + this.name + ": ");
        int newNote = input.nextInt();

        this.notes.add(newNote);
    }

    public void MaxElement()
    {
        int max = Collections.max(notes);
        System.out.println("Note la plus haute: " + max);
    }

    public void MinElement()
    {
        int min = Collections.min(notes);
        System.out.println("Note la plus basse: " + min);
    }


}
