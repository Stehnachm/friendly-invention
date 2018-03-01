/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsk98javasaxparser;

import java.util.ArrayList;

/**
 *
 * @author mattstehnach
 */
public class XMLObjectList {
    
    private ArrayList<XMLObject> objects;
    
    public XMLObjectList() {
        objects = new ArrayList<>();
    }
    
    public ArrayList<XMLObject> getObjects() {
        return objects;
    }
    
    public void addObject(XMLObject obj) {
        objects.add(obj);
    }
    
}
