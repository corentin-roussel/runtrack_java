public class ThreadInterruption extends Thread {
    public double time;
    public ThreadInterruption(int time) {
        this.time = time;
    }

    public void run() {
        try {

            time = time/2;
            long milliSeconds = (long)time * 1000L;
            Thread.sleep(milliSeconds);

        } catch (InterruptedException e) {
            System.out.println("Thread interrompu aprés " + time + " sec");
        }
    }


}
