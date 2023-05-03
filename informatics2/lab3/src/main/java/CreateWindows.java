public class CreateWindows implements Runnable {
    private Thread proectThread;
    public CreateWindows(Thread proectThread){
        this.proectThread = proectThread;
    }


    @Override
    public void run() {
        try{
            proectThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Изготовление окон начато");
        try {
            Thread.sleep(1000 * 7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Изготовление окон закончено");
    }
}
