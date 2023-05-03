public class InstallationOfPlumbing implements Runnable {
    private Thread communication;
    private Thread electrical;
    private Thread finishingWallAndCeiling;
    public InstallationOfPlumbing(Thread communication, Thread electrical, Thread finishingWallAndCeiling){
        this.communication = communication;
        this.electrical = electrical;
        this.finishingWallAndCeiling = finishingWallAndCeiling;
    }


    @Override
    public void run() {
        try{
            communication.join();
            electrical.join();
            finishingWallAndCeiling.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка сантехники начата");
        try {
            Thread.sleep(1000 *2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка сантехники закончена");
    }
}
