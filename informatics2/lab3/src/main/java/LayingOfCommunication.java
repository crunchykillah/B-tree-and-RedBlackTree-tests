public class LayingOfCommunication implements Runnable {
    private Thread fundament;
    public LayingOfCommunication(Thread fundament){
        this.fundament = fundament;
    }


    @Override
    public void run() {
        try{
            fundament.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Прокладка коммуникации начата");
        try {
            Thread.sleep(1000 * 4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Прокладка коммуникации закончена");
    }
}
