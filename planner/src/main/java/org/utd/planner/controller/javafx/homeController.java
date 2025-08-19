package org.utd.planner.controller.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class homeController {
    @FXML Button loginButton;

    @FXML Button button;

    @FXML Pane red;

    @FXML Text text;

    @FXML
    public void change() {
        if (text.getText().equals("Click on the button below to change")) {
            text.setText("Hello World!");
        }

        else {
            text.setText("Click on the button below to change");
        }
    }


    @FXML
    public void loginButtonOnAction() {
        System.out.println("Login");
    }
}
