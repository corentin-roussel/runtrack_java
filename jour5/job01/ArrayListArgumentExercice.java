public class ArrayListArgumentExercice {

    public static String listeFruit;
    public static void main(String[] args) {

        ArrayListArgument list = new ArrayListArgument();
        for (String fruit: args) {
            listeFruit = list.fillList(fruit);
        }

        System.out.println(listeFruit);


    }
}
