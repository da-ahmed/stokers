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
import model.Fournisseur;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AHM
 */
public class DaoFournisseur implements DaoGenr<Fournisseur> {
        static Session session;
	static Transaction tx;
        @SuppressWarnings("unchecked")
        @Override
  
        public ObservableList<Fournisseur> selectAll() {
         session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
                    ObservableList<Fournisseur> liste = FXCollections.observableArrayList(session.createQuery("from Fournisseur").list());
                    session.flush();
	            tx.commit();
	            session.close();
        
        
                     return liste;
        
    }

    @Override
    public boolean create(Fournisseur inst) {
       session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
                        session.save(inst);
			session.flush();
			tx.commit();
			session.close();
		
		return true;
    }

    @Override
    public boolean update(Fournisseur inst) {
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
		
			 org.hibernate.Query query=session.createQuery("DELETE from Fournisseur WHERE ID = :id");
                          query.setParameter("id",id );
                           query.executeUpdate();
			session.flush();
			session.getTransaction().commit();		
			session.getTransaction();
                        			
                        
                       return true;
    }

    @Override
    public Fournisseur cherch(int id) {
         session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();

                    ObservableList<Fournisseur> liste = FXCollections.observableArrayList(session.createQuery("FROM Fournisseur  where id = :id").setParameter("id",id).list());
                    session.flush();
	            tx.commit();
	            session.close();
         return liste.get(0);
        
    }
    
    
    
    
    
}
