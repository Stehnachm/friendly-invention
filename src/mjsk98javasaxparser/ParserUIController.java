/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsk98javasaxparser;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 *
 * @author mattstehnach
 */
public class ParserUIController implements Initializable {
    
    @FXML
    private TextArea textArea;
    
    @FXML
    private void handleFileOpen(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(textArea.getScene().getWindow());
        if (file != null) {
            try
            {
                textArea.clear();
                XMLObjectList xmlObjList = XMLObjectLoader.load(file);
                ArrayList<XMLObject> xmlOb = xmlObjList.getObjects();
                
                for (XMLObject ob : xmlOb) {
                    int depth = ob.getNodeIndex();
                    for (int i = 0; i < depth; i++) {
                        textArea.appendText("\t");
                    }
                    // It would be better to just do 1 string for data
                    textArea.appendText(ob.getTitle() + ": " + ob.getData(0) + "\n");
                }
            } catch (Exception ex) {
                displayExceptionAlert("Exception parsing XML file.", ex);
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void displayExceptionAlert(String exception_parsing_XML_file, Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
