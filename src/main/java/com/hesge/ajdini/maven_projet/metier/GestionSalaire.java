package com.hesge.ajdini.maven_projet.metier;
import com.hesge.ajdini.maven_projet.domaine.Employe;

/**
 *
 * @author artrit.ajdini
 */
public class GestionSalaire {

   public double calculSalaireAnnuel(Employe employe){
      double salaireAnnuel = 0;
      salaireAnnuel = employe.getSalaire() * 12;
      return salaireAnnuel;
   }
	
}

