package edu.jeffstate;

import java.io.File;

import javafx.application.Platform;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.Accordion;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.FileChooser;

import javax.swing.JOptionPane;

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
    private TitledPane titledGame, titleObject;
    @FXML
    private TreeView treeWorlds;
    @FXML
    private ContextMenu ctxTreeWorlds;
    @FXML
    private FlowPane flowObjects;

    @FXML
    private void FileQuit_OnAction(ActionEvent evt) {
        System.out.println("Exiting via MapMaker.onFileQuit method");

        Platform.exit();
    }

    @FXML
    private void FileNewZone_OnAction(ActionEvent evt) {
        try {
            var fc = new FileChooser();
            fc.setInitialDirectory(new File("Documents"));
            fc.setTitle("New Zone Map File");
            fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Zone Map File", "*.map"));
            var newFile = fc.showSaveDialog(getStage());
            var success = newFile.createNewFile();

            if (success) {
                var fileName = newFile.getName();

                // Create/Load Map Tab
                var tb = new Tab();
                tb.setText(fileName);
                tabContainer.getTabs().add(tb);

                if (MapMaker.TabData.containsKey(fileName)) {

                } else {
                    MapMaker.TabData.put(fileName, null);
                }

                // Collapse Games TitledPane

                // Show/Load Objects Titled Pane
            } else {
                //TODO: Need to identify what scenarios need to exist to be unable to create a new file
                JOptionPane.showMessageDialog(null, "Could not Create File: " + newFile.getName(), "Alert",
                                              JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @FXML
    private void titledGame_OnMouseClicked(ActionEvent evt) {
        // Obtain Existing List, if known

        // Create/Fill @lstWorlds

    }


}
