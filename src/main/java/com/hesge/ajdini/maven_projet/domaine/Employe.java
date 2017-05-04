/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hesge.ajdini.maven_projet.domaine;

import java.util.Date;

/**
 *
 * @author artrit.ajdini
 */
public class Employe {

   private String nom;
   private String prenom;
   private Date dateNaissance;
   private double salaire;
   private int age;
   
   public Employe(){}
   public Employe(String nom,String prenom,Date dateNaissance, double salaire, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.salaire = salaire;
        this.age = age; 
   }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
