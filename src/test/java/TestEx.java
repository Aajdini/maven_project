/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.hesge.ajdini.maven_projet.domaine.Employe;
import com.hesge.ajdini.maven_projet.domaine.Personne;
import com.hesge.ajdini.maven_projet.metier.GestionSalaire;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.*;
import static org.mockito.Mockito.*;
/**
 *
 * @author Artrit
 */
public class TestEx {
    
 @BeforeClass
 public void setUp() {
   
 }
 GestionSalaire gestSalaire= new GestionSalaire();
 Employe employe = new Employe();
 Date today = new Date();
 
 
/* @Test
   public void testCalculateAppriasal() {
   
      employe.setNom("Ajdini");
      employe.setAge(25);
      employe.setSalaire(7000);
      
      double appraisal = empBusinessLogic.calculateAppraisal(employee);
      Assert.assertEquals(500, appraisal, 0.0, "500");
   }*/

   // Test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
      employe.setNom("Ajdini");
      employe.setAge(25);
      employe.setSalaire(7000);
      
      double salaireA = gestSalaire.calculateSalaireAnnuel(employe);
      Assert.assertEquals(84000, salaireA, 0.0, "7000");
   }
   @Test
   public void testDateNaissance() {
       
      
      try{String string = "January 2, 2010";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
            LocalDate date = LocalDate.parse(string, formatter);
            System.out.println(date); // 2010-01-02
      }catch(Exception e){
          System.out.println(e);
      }
      
      employe.setNom("Ajdini");
      employe.setAge(25);
      employe.setSalaire(7000);
     // employe.setDateNaissance("12/10/1991");
      
      double salaireA = gestSalaire.calculateSalaireAnnuel(employe);
      Assert.assertEquals(84000, salaireA, 0.0, "7000");
   }

}
