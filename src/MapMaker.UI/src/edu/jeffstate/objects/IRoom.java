package edu.jeffstate.objects;

import java.awt.Point;

import java.util.Set;

interface IRoom extends INode {
    
    /** executes the given RoomCommand; which commands are accepted
     * depends on the implementing class
     */
    public void execute(RoomCommand cmd);

    /** creates a deep-copy of the given room's data (except links!)
     * and replaces its own data with it
     * @param orgRoom the room to be copied
     */
    public void deepCopyFrom(IRoom orgRoom);

    /** creates a new instance of its class, initializes it by calling
     * deepCopyFrom and returns it
     * @param map the map of the new room
     */
    public IRoom cloneRoom(AreaMap map);


    /** should only be called by Map parent
     */
    public void suicide();
    
    public NamedColor getColor();
}
