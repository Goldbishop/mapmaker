package edu.jeffstate;

import java.io.File;

import javafx.application.Platform;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;

import javafx.scene.Node;

import javafx.stage.FileChooser;

import javafx.stage.Stage;

import javax.swing.filechooser.FileNameExtensionFilter;

public class MapMakerGUIController extends MapMakerController {


    @FXML
    private void onFileQuit(ActionEvent evt) {
        System.out.println("Exiting via MapMaker.onFileQuit method");

        Platform.exit();
    }

    @FXML
    private void onFileNew(ActionEvent evt) {
        FileChooser fc = new FileChooser();
        fc.setTitle("New Map File");
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Map File", "*.map"));
        File newFile = fc.showOpenDialog(this._stage);

    }
}
