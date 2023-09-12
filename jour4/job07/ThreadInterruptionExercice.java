public class ThreadInterruptionExercice {

    public static void main(String[] args) {
        ThreadInterruption thread = new ThreadInterruption(10);
        thread.start();

        thread.interrupt();
    }
}
