/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hesge.ajdini.maven_projet.metier;

import com.hesge.ajdini.maven_projet.domaine.Employe;

/**
 *
 * @author artrit.ajdini
 */
public class GestionSalaire {

   // Calculate the yearly salary of employee
   public double calculateSalaireAnnuel(Employe employe){
      double salaireAnnuel = 0;
      salaireAnnuel = employe.getSalaire() * 12;
      return salaireAnnuel;
   }
	
  /*
   public double calculateAppraisal(EmployeeDetails employeeDetails){
   
      double appraisal = 0;
      
      if(employeeDetails.getMonthlySalary() < 10000){
         appraisal = 500;
         
      }else{
         appraisal = 1000;
      }
      
      return appraisal;
   }*/
}

