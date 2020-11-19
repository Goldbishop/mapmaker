package edu.jeffstate;

import javafx.stage.Stage;

abstract class MapMakerController {
    
    private Stage _stage;
    void setStage(Stage stage) {
        this._stage = stage;
    }
    Stage getStage(){
        return this._stage;
    }
}
