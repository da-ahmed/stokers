/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DaoUser.session;
import com.ahm.stockers.util.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Article;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AHM
 */
public class DaoArticle implements DaoGenr<Article> {
        static Session session;
	static Transaction tx;
    @SuppressWarnings("unchecked")    
    @Override
    public ObservableList<Article> selectAll() {
        session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
                    ObservableList<Article> liste = FXCollections.observableArrayList(session.createQuery("from Article").list());
                    session.flush();
	            tx.commit();
	            session.close();
        
        
                     return liste;
      
    }

    @Override
    public boolean create(Article inst) {
        session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
                        session.save(inst);
			session.flush();
			tx.commit();
			session.close();
		
		return true;
    }

    @Override
    public boolean update(Article inst) {
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
		
			 org.hibernate.Query query=session.createQuery("DELETE from Article WHERE ID = :id");
                          query.setParameter("id",id );
                           query.executeUpdate();
			session.flush();
			session.getTransaction().commit();		
			session.getTransaction();
                        			
                        
                       return true;
		
    }

    @Override
    public Article cherch(int id) {
      session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
//                   Query query = session.createQuery("FROM User where id = :id");
//                   query.setParameter("id",id);
                    ObservableList<Article> liste = FXCollections.observableArrayList(session.createQuery("FROM Article where id = :id").setParameter("id",id).list());
                    session.flush();
	            tx.commit();
	            session.close();
         return liste.get(0);
    }
    
}
