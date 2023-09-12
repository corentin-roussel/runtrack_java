import java.util.function.Predicate;

public class LambdaArgument {
public String chaine;
public String num;

    public LambdaArgument(String chaine, String num) {
        this.chaine = chaine;
        this.num = num;
    }


    public void checkLength() {
        Predicate<String> checkLongueur = (chaine) -> chaine.length() > Integer.parseInt(num);
        if(checkLongueur.test(chaine)) {
            System.out.println("La chaine " + chaine + " a une longueur supérieure a " + num);
        }else {
            System.out.println("La chaine " + chaine + " a une longueur inférieure a " + num);
        }
    }
}
