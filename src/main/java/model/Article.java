/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author AHM
 */

@Entity
@Table(name = "article")
public class Article {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
	private int id;
    @Column(name="codeart", nullable = false)
    private int Codeart;
    @Column(name="disiniationart", nullable = false)
    private String Disiniationart ;
     @Column(name="contiteart", nullable = false)
    private int Contiteart ; 
    @Column(name="prixart", nullable = false)
    private int Prixart;
    @Column(name="emplacementart", nullable = false)
    private String Emplacementart;

    public Article(int Codeart, String Disiniationart, int Contiteart, int Prixart, String Emplacementart) {
        this.Codeart = Codeart;
        this.Disiniationart = Disiniationart;
        this.Contiteart = Contiteart;
        this.Prixart = Prixart;
        this.Emplacementart = Emplacementart;
    }

    public int getCodeart() {
        return Codeart;
    }

    public String getDisiniationart() {
        return Disiniationart;
    }

    public int getContiteart() {
        return Contiteart;
    }

    public int getPrixart() {
        return Prixart;
    }

    public String getEmplacementart() {
        return Emplacementart;
    }

    public void setCodeart(int Codeart) {
        this.Codeart = Codeart;
    }

    public void setDisiniationart(String Disiniationart) {
        this.Disiniationart = Disiniationart;
    }

    public void setContiteart(int Contiteart) {
        this.Contiteart = Contiteart;
    }

    public void setPrixart(int Prixart) {
        this.Prixart = Prixart;
    }

    public void setEmplacementart(String Emplacementart) {
        this.Emplacementart = Emplacementart;
    }
    

    

    
    
    
    
}
