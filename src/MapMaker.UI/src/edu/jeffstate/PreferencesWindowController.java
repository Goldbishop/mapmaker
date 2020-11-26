package edu.jeffstate;

import javafx.fxml.FXML;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public final class PreferencesWindowController extends MapMakerController {
       
    /****
     * Cache Configuration Variable
     * - Temporary until Save and/or Cancel
     * > Save/Apply - persists the settings
     * > Cancel - any changes since last Apply are lost.
     */
    private MapMakerConfig _config;
    
    @FXML
    private TreeView tvMain;
    
    /*** TreeView Initialization ***/
    private void InitTreeView(){
        var itmRoot = new TreeItem<String>("Inbox");
        itmRoot.setExpanded(true);
        
        // Setup General Branch
        
        // Setup ? Branch
        
    }
}
