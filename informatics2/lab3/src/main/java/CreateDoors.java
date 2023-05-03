public class CreateDoors implements Runnable{
    private Thread proectThread;
    public CreateDoors(Thread proectThread){
        this.proectThread = proectThread;
    }


    @Override
    public void run() {
        try{
            proectThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Изготовление дверей начато");
        try {
            Thread.sleep(1000 * 7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Изготовление дверей закончено");
    }
}
