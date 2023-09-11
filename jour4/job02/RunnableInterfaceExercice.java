public class RunnableInterfaceExercice {

    public static void main(String[] args) {
        RunnableInterface runnable = new RunnableInterface();
        Thread thread1 = new Thread(runnable);

        thread1.start();

    }
}
