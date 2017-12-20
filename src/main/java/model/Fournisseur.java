/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
@Table(name = "Fournisseur")
public class Fournisseur implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
	private int id;
      @Column(name="numfour", nullable = false)
    private int Nimfour;
      @Column(name="nomfour", nullable = false)
    private int Nomfour;
     @Column(name="adressfour", nullable = false)
      private String Adressfour ;
     @Column(name="codepostfour")
      private int Codepostfour ;
      @Column(name="villefour")
      private String Villefour ;
      @Column(name="payes")
      private String Payes ;
      @Column(name="telfour")
      private int Telefour ;
       @Column(name="faxfour")
      private int Faxfour ;
       @Column(name="email")
      private String Email ;

    public Fournisseur(int Nimfour, int Nomfour, String Adressfour, int Codepostfour, String Villefour, String Payes, int Telefour, int Faxfour, String Email) {
        this.Nimfour = Nimfour;
        this.Nomfour = Nomfour;
        this.Adressfour = Adressfour;
        this.Codepostfour = Codepostfour;
        this.Villefour = Villefour;
        this.Payes = Payes;
        this.Telefour = Telefour;
        this.Faxfour = Faxfour;
        this.Email = Email;
    }

    public int getNimfour() {
        return Nimfour;
    }

    public int getNomfour() {
        return Nomfour;
    }

    public String getAdressfour() {
        return Adressfour;
    }

    public int getCodepostfour() {
        return Codepostfour;
    }

    public String getVillefour() {
        return Villefour;
    }

    public String getPayes() {
        return Payes;
    }

    public int getTelefour() {
        return Telefour;
    }

    public int getFaxfour() {
        return Faxfour;
    }

    public String getEmail() {
        return Email;
    }

    public void setNimfour(int Nimfour) {
        this.Nimfour = Nimfour;
    }

    public void setNomfour(int Nomfour) {
        this.Nomfour = Nomfour;
    }

    public void setAdressfour(String Adressfour) {
        this.Adressfour = Adressfour;
    }

    public void setCodepostfour(int Codepostfour) {
        this.Codepostfour = Codepostfour;
    }

    public void setVillefour(String Villefour) {
        this.Villefour = Villefour;
    }

    public void setPayes(String Payes) {
        this.Payes = Payes;
    }

    public void setTelefour(int Telefour) {
        this.Telefour = Telefour;
    }

    public void setFaxfour(int Faxfour) {
        this.Faxfour = Faxfour;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
      
      
      
      
}
