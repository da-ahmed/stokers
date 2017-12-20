package com.ahm.stockers;

import DAO.DaoUser;
import static com.ahm.stockers.SceneController.session;
import static com.ahm.stockers.SceneController.tx;
import com.ahm.stockers.util.HibernateUtil;
import static java.lang.Math.log;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.persistence.Query;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
     //Create student entity object
//  User user = new User();
//  user.setUsername("ahmed");
//  user.setRole(2);
//  user.setPassword("barkouti");
//  
//   User user2 = new User();
//  user2.setUsername("houssem");
//  user2.setRole(2);
//  user2.setPassword("guessmi");
// 
//
//  User user3 = new User();
//   user3.setUsername("moodi");
//  user3.setRole(2);
//  user3.setPassword("ji");
/*  
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  
  session.save (user);
  System.out.println("Inserted Successfully");
  session.getTransaction().commit();
  session.close();
  sessionFactory.close();
 
 List<User> sup ;
 sup=duser.selectAll();
 for(int i=0; i<sup.size(); i++) 
            System.out.println(sup.get(i).getUsername());
*/

 


//int i=duser.checkLogin1(6);
//user=duser.cherch(6);
//System.out.print(i);
//System.out.println(user.getUsername());

String log="ahmed";
String pass ="barkouti";

 DaoUser ex =new DaoUser();
 int i =ex.checkLogin(log, pass);
 System.out.println(i);



}
}
