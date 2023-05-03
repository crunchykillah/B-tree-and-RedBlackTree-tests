public class Build implements Runnable {
    private Thread project;
    private Thread window;
    private Thread door;
    private Thread foundation;
    private Thread communication;
    private Thread wall;
    private Thread roof;
    private Thread windows;
    private Thread doors;
    private Thread heating;
    private Thread electricity;
    private Thread finishingWallAndCeiling;
    private Thread floor;
    private Thread lights;
    private Thread plumbing;

    public Build(Thread project, Thread window,Thread door, Thread foundation,Thread communication,Thread wall,Thread roof,Thread windows,Thread doors, Thread heating, Thread electricity, Thread finishingWallAndCeiling, Thread floor,Thread lights,Thread plumbing ){
        this.project = project;
        this.window = window;
        this.door = door;
        this.foundation = foundation;
        this.communication = communication;
        this.wall = wall;
        this.roof = roof;
        this.windows = windows;
        this.doors = doors;
        this.heating = heating;
        this.electricity = electricity;
        this.finishingWallAndCeiling = finishingWallAndCeiling;
        this.floor = floor;
        this.lights = lights;
        this.plumbing = plumbing;
    }


    @Override
    public void run() {
        long st = System.nanoTime();
        System.out.println("Строительство начато");
        try {
            project.join();
            windows.join();
            door.join();
            foundation.join();
            communication.join();
            wall.join();
            roof.join();
            windows.join();
            doors.join();
            heating.join();
            electricity.join();
            finishingWallAndCeiling.join();
            floor.join();
            lights.join();
            plumbing.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long fn = System.nanoTime();
        System.out.println("Строительство закончено, затраченное время: " + ((fn-st)/1000000000) + " сек");
    }
}
