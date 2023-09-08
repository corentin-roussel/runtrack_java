public class Optional {

    String value = null;



    public void optional()
    {
        java.util.Optional<String> optionalValue = java.util.Optional.ofNullable(value);


        if(optionalValue.isPresent())
        {
            System.out.println("Longueur de la chaine " +value.length());
        }else {
            System.out.println("Chaine non fournie");
        }
    }
}
