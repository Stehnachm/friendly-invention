/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsk98javasaxparser;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mattstehnach
 */
public class XMLObject {

    private String title = "";
    private ArrayList<String> data = null;
    private int nodeIndex;
    private int parentIndex;
    
    public XMLObject(String... strings) {
        if (data == null) data = new ArrayList<>();
        data.addAll(Arrays.asList(strings)); 
    }
    
    public String getData(int index) {
        return data.get(index);
    }
    
    public ArrayList<String> getAllData() {
        return data;
    }
    
    public void addData(String string) {
        data.add(string);
    }
    
    public void setTitle(String string) {
        this.title = string;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getNodeIndex() {
        return this.nodeIndex;
    }
    
    public int getParentIndex() {
        return this.parentIndex;
    }
    
    public void setNodeIndex(int index) {
        this.nodeIndex = index;
    }
    
    public void setParentIndex(int index) {
        this.parentIndex = index;
    }
    
}
