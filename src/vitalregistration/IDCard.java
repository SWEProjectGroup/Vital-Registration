/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalregistration;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lydia
 */
public class IDCard extends Application{
     @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("IDCard.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        
        Scene scene = new Scene(root);
        Scene scene2 = new Scene(root2);
        
        stage.setScene(scene2);
        stage.show();
    }
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
