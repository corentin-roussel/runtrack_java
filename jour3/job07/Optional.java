public class Optional {

    String value = null;



    public void optional()
    {
        java.util.Optional<String> optionalValue = java.util.Optional.ofNullable(value);


        System.out.println(optionalValue.orElse("Chaine non fournie"));
    }
}
