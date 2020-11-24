package edu.jeffstate.utility;

import java.util.EnumMap;

/***
 * Factory to standardize creation and other Map related operations
 */
public final class MapFactory {

    }
    
    EnumMap<ROOMTYPE, String> rmMap;
    
    
    private void initialize(){
        rmMap = new EnumMap<ROOMTYPE, String>(ROOMTYPE.class);
        rmMap.put(ROOMTYPE.DESCROOM, "DescRoom");
        rmMap.put(ROOMTYPE.VIRTROOM, "VirtualRoom");
    }
}
