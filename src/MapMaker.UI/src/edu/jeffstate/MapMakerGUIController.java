package edu.jeffstate;

import java.io.File;

import javafx.application.Platform;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.Accordion;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.FileChooser;

public class MapMakerGUIController extends MapMakerController {

    /*** Control Variables
     * The Variable Name and Type, should reflect the same 'fx:id' value and XML Element
     * **/
    @FXML
    private Accordion leftAside;
    @FXML
    private MenuBar mainMenuBar;
    @FXML
    private ToolBar mainToolBar;
    @FXML
    private TabPane tabContainer;
    @FXML
    private HBox statusBar;

    @FXML
    private void FileQuit_OnAction(ActionEvent evt) {
        System.out.println("Exiting via MapMaker.onFileQuit method");

        Platform.exit();
    }

    @FXML
    private void onFileNew(ActionEvent evt) {
        try{
            FileChooser fc = new FileChooser();
            fc.setInitialDirectory(new File("c:\\"));
            fc.setTitle("New Map File");
            fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Map File", "*.map"));
            File newFile = fc.showSaveDialog(getStage());
            newFile.createNewFile();
            
            Tab tb = new Tab();
            tb.setText(newFile.getName());
            tabContainer.getTabs().add(tb);            
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
