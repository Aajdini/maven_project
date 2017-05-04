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
   private String dateNaissance;
   private String email;
   private double salaire;
   private int age;
   
   public Employe(){}
   public Employe(String nom, String prenom, String dateNaissance, String email, double salaire, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.salaire = salaire;
        this.age = age; 
   }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
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

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
