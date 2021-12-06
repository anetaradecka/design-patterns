import Workshop.Command.RobotCutCommand;
import Workshop.Command.RobotDrillCommand;
import Workshop.Command.RobotTurnOffCommand;
import Workshop.Command.RobotTurnOnCommand;
import Workshop.Robot;
import Workshop.WorkshopApp;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();

/*        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();
        workshopApp.run();*/

        workshopApp.addToQueue(new RobotTurnOffCommand(robot));
        workshopApp.run();
        workshopApp.undoLastCommand();
    }

}
