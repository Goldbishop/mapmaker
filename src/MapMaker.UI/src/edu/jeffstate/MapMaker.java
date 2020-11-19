package edu.jeffstate;

import java.util.EventObject;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class MapMaker extends Application {
    public MapMaker() {
        super();
    }

    public static void main(String[] args) {
        launch(args);
    }

    /*** JavaFX 11 implementation ***/
    @Override
    public void start(Stage stage) throws Exception {
        try {
            //Parent root = FXMLLoader.load(getClass().getResource("MapMakerGUI.fxml"));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MapMakerGUI.fxml"));
            Parent root = loader.load();
            MapMakerController controller = loader.getController();
            controller.setStage(stage);

            var scene = new Scene(root);

            stage.setTitle("Map Maker");
            stage.setScene(scene);
            stage.show();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void stop() {
        System.out.println("Exiting via MapMaker.stop method");

        System.exit(0);
    }

}
