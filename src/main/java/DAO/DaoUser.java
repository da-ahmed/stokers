/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.ahm.stockers.util.HibernateUtil;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.TypedQuery;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author AHM
 */
public class DaoUser implements DaoGenr<User> {
    static Session session;
	static Transaction tx;
     
     @Override
     @SuppressWarnings("unchecked")
    public ObservableList<User> selectAll() {
        session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
                    ObservableList<User> liste = FXCollections.observableArrayList(session.createQuery("from User").list());
                    session.flush();
	            tx.commit();
	            session.close();
        
        
                     return liste;
        
    }

    /**
     *
     * @param inst
     * @return
     */
       
   
    @Override
    public boolean create(User inst) {
        session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
                        session.save(inst);
			session.flush();
			tx.commit();
			session.close();
		
		return true;
    }

   @Override
    public boolean update(User inst) {
      
        session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
                        session.saveOrUpdate(inst);
			session.flush();
			tx.commit();
			session.close();
                        
                       return true ;
    }

    @Override
    public boolean delete(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
		
			 org.hibernate.Query query=session.createQuery("DELETE from User WHERE ID = :id");
                          query.setParameter("id",id );
                           query.executeUpdate();
			session.flush();
			session.getTransaction().commit();		
			session.getTransaction();
                        			
                        
                       return true;
		
        
        
        
      
       
    }

    @Override
     @SuppressWarnings("unchecked")
    public User cherch(int id) {
       session = HibernateUtil.getSessionFactory().openSession();
  //                  Query query = session.createQuery("FROM User where id = :id");
//                  query.setParameter("id",id);
                    ObservableList<User> liste = FXCollections.observableArrayList(session.createQuery("FROM User where id = :id").setParameter("id",id).list());
                    session.flush();
	            tx.commit();
	            session.close();
         return liste.get(0);
        //if (liste.isEmpty()) {
          //  return null;
            //}
      // return liste.get(0);
      
      
     
    
    
    
                                                     }
       
   
 
   
    public int checkLogin(String log, String pass)
    {
        session = HibernateUtil.getSessionFactory().openSession();
                     ObservableList<User> liste;
                     liste = FXCollections.observableArrayList(session.createQuery("FROM User where username =:log And password=:password ").setParameter("log",log).setParameter("password",pass).list());
                     session.flush();
	             session.close();
                    
        if (liste.size()==1)
        {
            return 1;
        }else if (liste.size()==0)
        { 
        return -1;
        }
        return 0;
        
    }
    
    
    








}
      