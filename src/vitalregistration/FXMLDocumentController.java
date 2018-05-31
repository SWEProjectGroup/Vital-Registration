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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Lydia
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label, signIn;
    private Button login;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       Stage stage;
       Parent newScene;
       stage = (Stage) label.getScene().getWindow();
       newScene = FXMLLoader.load(getClass().getResource("Home.fxml"));        
              
       Scene scene = new Scene(newScene);
       stage.setScene(scene);
       stage.setTitle("Home");
       stage.setX(300);
       stage.setY(50);
       stage.show();
       label.setText("login");
       System.out.println(signIn);
       
       
    }
    
    @FXML
    private void handleMouseAction(MouseEvent evt) throws IOException{
       Stage stage;
       Parent newScene;
       stage = (Stage) label.getScene().getWindow();
       newScene = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
       Scene scene = new Scene(newScene);
       stage.setScene(scene);
       stage.setTitle("Sign Up");
       stage.show();
       label.setText("signup");
       System.out.println(signIn);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
            // TODO
           
    }    
    
}
