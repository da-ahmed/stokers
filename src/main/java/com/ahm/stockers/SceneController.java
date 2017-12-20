/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahm.stockers;

import DAO.DaoUser;
import com.ahm.stockers.util.HibernateUtil;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import static javassist.CtMethod.ConstParameter.string;
import static jdk.nashorn.internal.runtime.Debug.id;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;




/**
 * FXML Controller class
 *
 * @author AHM
 */
public class SceneController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button Login;
    @FXML
    private PasswordField Password;
    @FXML
    private TextField Username;
    @FXML
    private Button Singin;

    /**
     * Initializes the controller class.
     * @param url
     */ private String log ;
        private String pass;
        static Session session;
	static Transaction tx;
        boolean b1;
        boolean b2;
        
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
      public void handlesingin(ActionEvent event) throws IOException {
        
          Stage st=new Stage();
          Parent sing = FXMLLoader.load(getClass().getResource("/fxml/SingInScene.fxml"));
        
        Scene scene = new Scene(sing);
        scene.getStylesheets().add("/styles/singinsceane.css");
        
        st.setTitle("sing in");
        st.setScene(scene);
        st.show();
          
          
          
          
          
          
    }
    @FXML
 private void handleButtonAction(ActionEvent event) throws IOException {
        log=Username.getText();
        pass=Password.getText();
       
        
        DaoUser duser = new DaoUser();
     int isuser;
     isuser=duser.checkLogin(log, pass);

        
                   
                   if (isuser==1)
                    {
                     
                            Parent Menu = FXMLLoader.load(getClass().getResource("/fxml/Home.fxml"));
                            Scene home_page_scene = new Scene(Menu);
                            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            app_stage.setScene(home_page_scene);
                                    app_stage.show();
                    }else 
                    {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Information Dialog");
                            alert.setHeaderText("problprobleme lors de la connexion");
                            alert.setContentText("les information que vous avez entrée sont  invalide");
                            alert.showAndWait();   
                    }   
                        
    
// Button was clicked, do something...
   
 }
    
}
