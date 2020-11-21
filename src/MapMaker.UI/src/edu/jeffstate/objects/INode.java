package edu.jeffstate.objects;

import java.awt.Point;

import java.util.Map;
import java.util.Set;

public interface INode<T> {
    /***
     * @return the collection of Exits
     */
    public Map<DirectionEnum, T> getExits();

    /** 
     * @returns the Nodes's position on the map
     */
    public Point getPos();

}
