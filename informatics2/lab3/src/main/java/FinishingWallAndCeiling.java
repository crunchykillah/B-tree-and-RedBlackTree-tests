public class FinishingWallAndCeiling implements Runnable {
    private Thread window;
    private Thread doors;
    private Thread electrical;
    public FinishingWallAndCeiling(Thread window, Thread doors, Thread electrical){
        this.window = window;
        this.doors = doors;
        this.electrical = electrical;
    }


    @Override
    public void run() {
        try{
            window.join();
            doors.join();
            electrical.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Отделка стен и потолка начата");
        try {
            Thread.sleep(1000 * 7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Отделка стен и потолка закончена");
    }
}
