public class FoundationBuilding implements Runnable{
    private Thread proectThread;
    public FoundationBuilding(Thread proectThread){
        this.proectThread = proectThread;
    }


    @Override
    public void run() {
        try{
            proectThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Возведение фундамента начато");
        try {
            Thread.sleep(1000 * 14);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Возведение фундамента закончено");
    }
}
