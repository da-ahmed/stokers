package com.ahm.stockers.util;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;

    static {
            try {
                Configuration cfg = getConfiguration();         
                StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
                sb.applySettings(cfg.getProperties());
                StandardServiceRegistry standardServiceRegistry = sb.build();                   
                sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);              
            } catch (Throwable th) {
                    System.err.println("Initial SessionFactory creation failed" + th);
                    throw new ExceptionInInitializerError(th);
            }
    }
    
    public static SessionFactory getSessionFactory() {
            return sessionFactory;
    }

     private static  Configuration getConfiguration() {
          Configuration cfg = new Configuration();
         cfg.addAnnotatedClass(User.class );
      
          
          cfg.setProperty("hibernate.connection.driver_class",     "com.mysql.jdbc.Driver");
          cfg.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/stock");
          cfg.setProperty("hibernate.connection.username", "root");
          cfg.setProperty("hibernate.connection.password", "");
          cfg.setProperty("hibernate.show_sql", "true");
//          cfg.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5InnoDBDialect");
          cfg.setProperty("hibernate.hbm2ddl.auto", "update");
//          cfg.setProperty("hibernate.cache.provider_class","org.hibernate.cache.NoCacheProvider");
         cfg.setProperty("hibernate.current_session_context_class", "thread");
          
//          cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
          cfg.setProperty("hibernate.connection.useUnicode", "true");
          cfg.setProperty("hibernate.connection.characterEncoding", "UTF-8");

//          cfg.setProperty("hibernate.c3p0.min_size", "5");
//          cfg.setProperty("hibernate.c3p0.max_size", "20");
//          cfg.setProperty("hibernate.c3p0.timeout", "1800");
//          cfg.setProperty("hibernate.c3p0.max_statements", "50");
          return cfg;
     }

	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}