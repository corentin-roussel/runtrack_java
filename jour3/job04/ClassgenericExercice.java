

public class ClassgenericExercice {

    public static void main(String[] args) {
        ClassGeneric<Integer> generic = new ClassGeneric<>();
        generic.addElement(1,2,3,4,5,6,7);

        generic.retrieve();

        ClassGeneric<String> generic1 = new ClassGeneric<>();
        generic1.addElement("Salut", "comment", "ca", "va ?");

        generic1.retrieve();

    }

}
