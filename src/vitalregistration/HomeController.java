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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lydia
 */
public class HomeController extends ButtonHandlers implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private void HandleButtonAction(ActionEvent event) throws IOException{
       super.ButtonHandler(event);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
       
}
