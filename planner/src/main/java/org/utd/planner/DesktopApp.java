package org.utd.planner;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DesktopApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/templates/fxml/raisagift.fxml")); 
        stage.setScene(new Scene(root));                        //change fxml name to run
        stage.setTitle("Planner App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}