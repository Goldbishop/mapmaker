package edu.jeffstate;

import java.io.Serializable;

public final class MapMakerConfig implements Serializable {
    @SuppressWarnings("compatibility:-7856004910485516322")
    private static final long serialVersionUID = 1L;

    public MapMakerConfig() {
        super();
    }

    private final String file = "MapMaker.mcfg";
    private final transient String DEFDIR = "DEFAULTDIRECTORY";
    }

    /*** File Operations ***/
    protected boolean ExportToFile() {
        var result = false;

        return result;
    }

    protected boolean ImportFromFile() {
        var result = false;

        return result;
    }
}
