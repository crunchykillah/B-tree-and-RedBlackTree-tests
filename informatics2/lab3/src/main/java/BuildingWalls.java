public class BuildingWalls implements Runnable {
    private Thread fundament;
    public BuildingWalls(Thread fundament){
        this.fundament = fundament;
    }


    @Override
    public void run() {
        try{
            fundament.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Возведение стен начато");
        try {
            Thread.sleep(1000 * 14);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Возведение стен закончено");
    }
}
