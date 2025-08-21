package org.utd.planner.controller.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class raisaideaController {

    @FXML Button viewSchedule;
    @FXML Button newSchedule;
    @FXML Text helloWorld;

    public void method() {
        System.out.println("You can't view your schedule here.");
    }

    public void bark() {
        System.out.println("BARK BARK BARK");
        helloWorld.setText("Your Name");
    }
    
}
