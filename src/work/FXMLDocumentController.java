/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
/**
 *
 * @author Wasim
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
     @FXML
    private Label label1;
       @FXML
    private Label addd;
    @FXML
    private Button blue;
    @FXML
   
    private void handleButtonAction(ActionEvent event) {
        //System.out.println("You clicked me!");
        label.setText(""+10.0);
        addd.setText(""+ 10.0);
    }
    @FXML
     private void handleButton(ActionEvent event) {
        //System.out.println("You clicked me!");
        label1.setText("" + 7.0);
         float sum = Float.parseFloat(label.getText());
         float sum2= Float.parseFloat(label1.getText());
       addd.setText(Float.toString(sum+sum2));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
        //addd.setText(""+label+label1);
        
    }    
    
}
