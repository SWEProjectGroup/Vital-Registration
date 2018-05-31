/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalregistration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Lydia
 */
public class IDCardController extends ButtonHandlers implements Initializable {

    /**
     * Initializes the controller class.
     */
     
    
      @FXML
    private void HandleButtonAction(ActionEvent event) throws IOException{
       super.ButtonHandler(event);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
