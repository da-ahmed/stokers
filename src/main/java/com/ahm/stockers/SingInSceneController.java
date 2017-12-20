/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahm.stockers;

import DAO.DaoUser;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.User;

/**
 * FXML Controller class
 *
 * @author AHM
 */
public class SingInSceneController implements Initializable {

    @FXML
    private PasswordField Password;
    @FXML
    private PasswordField Repetpassword;
    @FXML
    private Button Singin;
    @FXML
    private Button Clear;
    @FXML
    private TextField Username;

    
    User user = new User();
    DaoUser daouser =new DaoUser();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
      public void handlesingin(ActionEvent event)  {
//          ObservableList<User> liste = FXCollections.observableArrayList();
//                    liste=daouser.selectAll();
//                    boolean b=false;
//                    for(int i=0; i<liste.size(); i++) 
//                         {
//                        b=liste.get(i).getUsername().equals(Username.getText());
//                        if(b=true)
//                        {break;}
//                         }
//          System.out.println(b);
          
          
         if (Password.getText().equals(Repetpassword.getText() ))
         {
             
                    
//             if(b=true)
//             {
//                 Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
//                 alert1.setTitle("alert");
//                 alert1.setHeaderText("problprobleme lors de la creation de user ");
//                 alert1.setContentText("USsername existe");
//                 
//             }
//             else
//             {
                 
                 
                 
                 
                 user.setUsername(Username.getText());
                 user.setPassword(Password.getText());
                 user.setRole(1);
                 boolean a =daouser.create(user);
                 
           //  }
             
             
             
         } 
         else 
         {
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
             alert.setTitle("alert");
             alert.setHeaderText("problprobleme lors de la creation de user ");
             alert.setContentText("les deux password ne sont pas identique");
             alert.showAndWait();
             Username.setText("");
             Password.setText("");
             Repetpassword.setText("");
         }
          
      }
        @FXML
        public void handleclear(ActionEvent event) 
        {
          Username.setText("");
          Password.setText("");
          Repetpassword.setText("");        
        }
}

 
   