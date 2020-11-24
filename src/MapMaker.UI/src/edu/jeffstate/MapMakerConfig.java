package edu.jeffstate;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Optional;

import javax.swing.filechooser.FileSystemView;

public final class MapMakerConfig implements Serializable {
    @SuppressWarnings("compatibility:-7856004910485516322")
    private static final long serialVersionUID = 1L;

    public MapMakerConfig() {
        super();
        _backStore = new HashMap<String, Object>();
    }

    private final String file = "MapMaker.mcfg";
    private final transient String DEFDIR = "DEFAULTDIRECTORY";
    private transient HashMap<String, Object> _backStore;

    /***
     * Property design
     */
    protected String Directory(Optional<String> val) {
        if (!_backStore.containsKey(DEFDIR)) {
            // Key Not in Backing Store; time to setup initial value
            _backStore.put(DEFDIR, FileSystemView.getFileSystemView()
                                                 .getDefaultDirectory()
                                                 .getPath());

        }
        
        return _backStore.get(DEFDIR).toString();
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
