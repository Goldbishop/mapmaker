package edu.jeffstate.objects;

import java.awt.Point;

import java.util.Collections;
import java.util.Map;

import javafx.scene.paint.Color;

/***
 * Represents a simple Node object on a Map
 */
class Room implements INode<Link> {
    public Room() {
    }

    public Color getColor() {
        return null;
    }

/*** INode Contract Implementation ***/
    @Override
    public Map<DirectionEnum, Link> getConnections() {
        // TODO Implement this method
        return Collections.emptyMap();
    }

    @Override
    public Point getPos() {
        // TODO Implement this method
        return null;
    }
}
