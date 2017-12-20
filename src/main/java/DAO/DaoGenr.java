/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javafx.collections.ObservableList;

/**
 *
 * @author AHM
 * @param <C>
 */
public interface DaoGenr<C> {
    
    
    //return a liste off the object of type c 
     public ObservableList<C> selectAll();
     //creation de lobjet
    public boolean  create (C inst);
    //mise ajour lobjet 
    public boolean update ( C inst   );
   //suprimer lobjet    
    public boolean delete(int id) ;
   //return liste of all the object     
    public C  cherch (int id );

    
    
    
    
    
    
    
    
    
    
    
    
    
}
