import org.junit.internal.runners.statements.RunAfters;

public class Project implements Runnable {

    @Override
    public void run() {
        System.out.println("Проект начат");
        try {
            Thread.sleep(1000 * 7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Проект закончен");
    }
}
