public class Main {
    public static void main(String[] args) {
        Thread project = new Thread(new Project());
        Thread windows = new Thread(new CreateWindows(project));
        Thread doors = new Thread(new CreateDoors(project));
        Thread foundation = new Thread(new FoundationBuilding(project));
        Thread communication = new Thread(new LayingOfCommunication(foundation));
        Thread walls = new Thread(new BuildingWalls(foundation));
        Thread roof = new Thread(new BuildingRoof(walls));
        Thread instOfWindows = new Thread(new InstallationOfWindows(windows, roof));
        Thread instOfDoors = new Thread(new InstallationOfDoors(doors,roof));
        Thread instOfHeating = new Thread(new InstallationOfHeatingAppliances(communication,instOfWindows,instOfDoors));
        Thread electricity = new Thread(new ElectricalWiring(communication,roof));
        Thread finishingWallAndCeiling = new Thread(new FinishingWallAndCeiling(instOfWindows,instOfDoors,electricity));
        Thread floor = new Thread(new FinishingFloor(finishingWallAndCeiling));
        Thread lights = new Thread(new InstallationOfLights(finishingWallAndCeiling));
        Thread plumbing = new Thread(new InstallationOfPlumbing(communication,electricity,finishingWallAndCeiling));
        Thread build = new Thread(new Build(project,windows,doors,foundation,communication,walls,roof,instOfWindows,instOfDoors,instOfHeating,electricity,finishingWallAndCeiling,floor,lights,plumbing));
        build.start();
        project.start();
        windows.start();
        doors.start();
        foundation.start();
        communication.start();
        walls.start();
        roof.start();
        instOfWindows.start();
        instOfDoors.start();
        instOfHeating.start();
        electricity.start();
        finishingWallAndCeiling.start();
        floor.start();
        lights.start();
        plumbing.start();
    }
}
