package org.vaadin.patrik.client;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.event.dom.client.KeyCodes;

public final class Keys {
    private static final Set<Integer> alphaNumSet;
    
    private static final Set<Integer> rowChangeKeys;
    
    private static final Set<Integer> colChangeKeys;
    
    static {
        alphaNumSet = new HashSet<Integer>();
        
        for (int i = KeyCodes.KEY_A; i <= KeyCodes.KEY_Z; i++) {
            alphaNumSet.add(i);
        }
        for (int i = KeyCodes.KEY_ZERO; i <= KeyCodes.KEY_NINE; i++) {
            alphaNumSet.add(i);
        }
        for (int i = KeyCodes.KEY_NUM_ZERO; i <= KeyCodes.KEY_NUM_NINE; i++) {
            alphaNumSet.add(i);
        }
        
        rowChangeKeys = new HashSet<Integer>();
        rowChangeKeys.add(KeyCodes.KEY_UP);
        rowChangeKeys.add(KeyCodes.KEY_DOWN);
        rowChangeKeys.add(KeyCodes.KEY_PAGEUP);
        rowChangeKeys.add(KeyCodes.KEY_PAGEDOWN);
        
        colChangeKeys = new HashSet<Integer>();
        colChangeKeys.add(KeyCodes.KEY_TAB);
        
    }
    
    public static void setEnterBehavior(boolean changeColumnByEnter) {
    	if (changeColumnByEnter) {
            colChangeKeys.add(KeyCodes.KEY_ENTER);
            colChangeKeys.add(KeyCodes.KEY_MAC_ENTER);  		
    	} else {
            rowChangeKeys.add(KeyCodes.KEY_ENTER);
            rowChangeKeys.add(KeyCodes.KEY_MAC_ENTER);    		
    	}
    }
    
    public static boolean isUpDownArrowKey(int keycode) {
        if(keycode == KeyCodes.KEY_UP || keycode == KeyCodes.KEY_DOWN || keycode == KeyCodes.KEY_PAGEUP || keycode == KeyCodes.KEY_PAGEDOWN) {
            return true;
        }
        return false;
    }
    
    public static boolean isDelKey(int keycode) {
    	if(keycode == KeyCodes.KEY_DELETE) {
    		return true;
    	}
    	return false;
    }

    public static boolean isHomeKey(int keycode) {
    	if(keycode == KeyCodes.KEY_HOME) {
    		return true;
    	}
    	return false;
    }

    public static boolean isEndKey(int keycode) {
    	if(keycode == KeyCodes.KEY_END) {
    		return true;
    	}
    	return false;
    }
    

    /**
     * Test if keycode is one of the alpha numeric keys [0-9a-zA-Z]
     */
    public static boolean isAlphaNumericKey(int keyCode) {
        return alphaNumSet.contains(keyCode);
    }

    /**
     * Test if keycode is defined as a row change key
     */
    public static boolean isRowChangeKey(int keyCode) {
        return rowChangeKeys.contains(keyCode);
    }
    
    public static boolean isColumnChangeKey(int keyCode) {
        return colChangeKeys.contains(keyCode);
    }
}
