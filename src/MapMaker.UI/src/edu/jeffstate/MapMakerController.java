package edu.jeffstate;

import javafx.stage.Stage;

abstract class MapMakerController {
    
    protected Stage _stage;
    protected void setStage(Stage stage) {
        this._stage = stage;
    }
}
