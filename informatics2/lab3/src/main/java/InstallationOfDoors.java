public class InstallationOfDoors implements Runnable {
    private Thread proectThread;
    private Thread doors;
    private Thread roof;
    public InstallationOfDoors(Thread doors, Thread roof){
        this.doors = doors;
        this.roof = roof;
    }


    @Override
    public void run() {
        try{
            doors.join();
            roof.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка дверей начата");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Установка дверей закончена");
    }
}
