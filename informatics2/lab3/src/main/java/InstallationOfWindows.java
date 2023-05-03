public class InstallationOfWindows implements Runnable {

    private Thread windows;
    private Thread roof;
    public InstallationOfWindows(Thread windows, Thread roof){
        this.windows = windows;
        this.roof = roof;
    }


    @Override
    public void run() {
        try{
            windows.join();
            roof.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка окон начата");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка окон закончена");
    }
}
