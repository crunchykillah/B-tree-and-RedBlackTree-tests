public class InstallationOfHeatingAppliances implements Runnable {
    private Thread communication;
    private Thread windows;
    private Thread doors;
    public InstallationOfHeatingAppliances(Thread windows,Thread doors,Thread communication){
        this.windows = windows;
        this.doors = doors;
        this.communication = communication;
    }


    @Override
    public void run() {
        try{
            doors.join();
            windows.join();
            communication.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка отопительных приборов начато");
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка отопительных приборов закончено");
    }
}
