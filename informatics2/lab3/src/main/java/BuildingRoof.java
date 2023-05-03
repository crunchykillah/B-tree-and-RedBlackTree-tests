public class BuildingRoof implements Runnable {
    private Thread window;
    public BuildingRoof(Thread window){
        this.window = window;
    }


    @Override
    public void run() {
        try{
            window.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка крыши начата");
        try {
            Thread.sleep(1000 *3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка крыши начата");
    }
}
