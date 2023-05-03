public class FinishingFloor implements Runnable {
    private Thread finishingWallAndCeiling;
    public FinishingFloor(Thread finishingWallAndCeiling){
        this.finishingWallAndCeiling = finishingWallAndCeiling;
    }


    @Override
    public void run() {
        try{
            finishingWallAndCeiling.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Отделка пола начата");
        try {
            Thread.sleep(1000 * 7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Отделка пола закончена");
    }
}
