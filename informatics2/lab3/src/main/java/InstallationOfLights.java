public class InstallationOfLights implements Runnable {
    private Thread finishingWallAndCeiling;
    public InstallationOfLights(Thread finishingWallAndCeiling){
        this.finishingWallAndCeiling = finishingWallAndCeiling;
    }


    @Override
    public void run() {
        try{
            finishingWallAndCeiling.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка осветительных приборов начата");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка осветительных приборов закончена");
    }
}
