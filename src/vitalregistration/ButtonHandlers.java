/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalregistration;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Lydia
 */
public class ButtonHandlers {
    @FXML
    private Button issueID;
    @FXML private Button issueCertificates;    
    @FXML private Button issueRelease;
    @FXML private Button replaceLost;
    @FXML private Button online;
    @FXML private Button search;
    @FXML private Button logout; 
    
    public void ButtonHandler(ActionEvent event) throws IOException{
        Stage stage;
       Parent newScene;
       
        if (event.getSource() == issueCertificates) {
            stage = (Stage) issueCertificates.getScene().getWindow();
            newScene = FXMLLoader.load(getClass().getResource("Certificates.fxml"));            
        }else if(event.getSource() == issueID){
            stage = (Stage) issueCertificates.getScene().getWindow();
            newScene = FXMLLoader.load(getClass().getResource("IDCard.fxml")); 
        }
        else if(event.getSource() == issueRelease){
            stage = (Stage) issueCertificates.getScene().getWindow();
            newScene = FXMLLoader.load(getClass().getResource("ReleaseLetter.fxml")); 
        } 
        else if(event.getSource() == replaceLost){
            stage = (Stage) issueCertificates.getScene().getWindow();
            newScene = FXMLLoader.load(getClass().getResource("Replace.fxml")); 
        } 
        else if(event.getSource() == online){
            stage = (Stage) issueCertificates.getScene().getWindow();
            newScene = FXMLLoader.load(getClass().getResource("OnlineForms.fxml")); 
        } 
        else if(event.getSource() == search){
            stage = (Stage) issueCertificates.getScene().getWindow();
            newScene = FXMLLoader.load(getClass().getResource("Search.fxml")); 
        } 
        else{
            stage = (Stage) issueCertificates.getScene().getWindow();
            newScene = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")); 
        }
        
       Scene scene = new Scene(newScene);
       stage.setScene(scene);
       stage.setX(300);
       stage.setY(50);
       stage.show();
    }
}
