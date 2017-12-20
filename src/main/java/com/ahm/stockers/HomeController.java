/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahm.stockers;

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
 * @author AHM
 */
public class HomeController implements Initializable {

    @FXML
    private Button articlecrud;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    @FXML
    
    
       public void handlesingin(ActionEvent event) throws IOException {
        
          Stage st=new Stage();
          Parent sing = FXMLLoader.load(getClass().getResource("/fxml/home.fxml"));
        
        Scene scene = new Scene(sing);
        scene.getStylesheets().add("/styles/singinsceane.css");
        
        st.setTitle("article");
        st.setScene(scene);
        st.show();
          
          
          
          
          
          
    }
    
    
    
}
