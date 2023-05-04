import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet earf = new Earf();
        Planet jupiter = new Jupiter();
        Planet neptune = new Neptune();
        Planet youranus = new Youranus();
        Planet venus = new Venus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer cyborg = new AndroidExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        earf.accept(astronaut);
        jupiter.accept(astronaut);
        neptune.accept(astronaut);
        youranus.accept(astronaut);
        venus.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        earf.accept(rover);
        jupiter.accept(rover);
        neptune.accept(rover);
        youranus.accept(rover);
        venus.accept(rover);

        mars.accept(cyborg);
        saturn.accept(cyborg);
        mercury.accept(cyborg);
        earf.accept(cyborg);
        jupiter.accept(cyborg);
        neptune.accept(cyborg);
        youranus.accept(cyborg);
        venus.accept(cyborg);
    }
}