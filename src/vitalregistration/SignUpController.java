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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lydia
 */
public class SignUpController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button signUp;
     @FXML
    private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void HandleButtonAction(ActionEvent event) throws IOException{
       Stage stage;
       Parent newScene;
       stage = (Stage) signUp.getScene().getWindow();
       newScene = FXMLLoader.load(getClass().getResource("Home.fxml"));        
              
       Scene scene = new Scene(newScene);
       stage.setScene(scene);
       stage.setTitle("Home");
       stage.setX(300);
       stage.setY(50);
       stage.show();
       System.out.println(label);
    }
    
}
