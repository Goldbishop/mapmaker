package edu.jeffstate.objects;

import java.awt.Point;

import java.util.Map;
import java.util.Set;

public interface INode {
    /***
     * @return the collection of Exits
     */
    public Map<DirectionEnum, INode> getExits();

    /** 
     * @returns the Nodes's position on the map
     */
    public Point getPos();

}
