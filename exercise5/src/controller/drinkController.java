package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class drinkController {
 
    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    GrapeJuice grapeski = new GrapeJuice();
    Matcha ceremonialMatcha = new Matcha();
    RootBeer mugski = new RootBeer();
    SolaRaspberry solaGlass = new SolaRaspberry();
    Water mul = new Water();

    public void initialize() {

        grapeski.setColor("Grape juice looks purple. Sometimes burgundy.");
        grapeski.setTaste("of course, it tastes like grapes. Pretty self-explanatory.");

        ceremonialMatcha.setColor("Matcha looks distinctly green.");
        ceremonialMatcha.setTaste("ceremonial matcha of the highest quality often tastes mildly sweet and rich, with a slightly bitter aftertaste.");

        mugski.setColor("MUG Root beer has a deep brown color, often fizzing from carbonation.");
        mugski.setTaste("it tastes like carbonated root soda. A very distinct taste.");

        solaGlass.setColor("Sola Raspberry has a deep plum hue, very indicative of raspberries.");
        solaGlass.setTaste("it tastes like raspberry juice. Reminiscent of summer.");

        mul.setColor("Water looks clear. Depende nalang siguro sa tubig na iniinom mo.");
        mul.setTaste("water should taste like nothing. Depende nalang din siguro sa iniinom mong tubig?");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText(grapeski.getColor() + " and " + grapeski.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText(ceremonialMatcha.getColor() + " and " + ceremonialMatcha.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText(mugski.getColor() + " and " + mugski.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText(solaGlass.getColor() + " and " + solaGlass.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText(mul.getColor() + " and " + mul.getTaste());
            }
        
    
        alert.showAndWait();

    }
}