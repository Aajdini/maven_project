/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hesge.ajdini.maven_projet.domaine;

/**
 *
 * @author Artrit
 */
public class Personne {
    
    private String name;
    private String prenom;
    private int age;
    
   // public Personne(){}
    public Personne(String name, String prenom, int age){
        this.name = name;
        this.prenom = prenom;
        this.age = age; 
    }
    
    public String getName(){
        return name;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    
}
