public class ElectricalWiring implements Runnable {
    private Thread communication;
    private Thread roof;
    public ElectricalWiring(Thread communication, Thread roof){
        this.communication = communication;
        this.roof = roof;
    }


    @Override
    public void run() {
        try{
            communication.join();
            roof.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Прокладка электропроводки начата");
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Прокладка электропроводки закончена");
    }
}
