import com.hesge.ajdini.maven_projet.domaine.Employe;
import com.hesge.ajdini.maven_projet.metier.GestionSalaire;
import org.testng.Assert;
import org.testng.annotations.*;
/**
 *
 * @author Artrit 
 */
public class TestEx {
    /*variables*/
    GestionSalaire gestSalaire;
    Employe employe;
 
    @BeforeClass
    public void setUp() {
        gestSalaire = new GestionSalaire();
        employe = new Employe();
        employe.setNom("Ajdini");
        employe.setPrenom("Artrit");
        employe.setDateNaissance("12-10-1991");
        employe.setAge(25);
        employe.setEmail("aa@hesge.ch");
        employe.setSalaire(7000);
    }//setUp()

    @Test
    public void testCalculSalaireAnnuel() {
        double salaireA = gestSalaire.calculSalaireAnnuel(employe);
        Assert.assertEquals(84000, salaireA, 0.0, "Devrait être égal à 8400");
    }//testCalculSalaireAnnuel()
    
    @Test
    public void testCalculSalaireZero() {
        double salaireA = gestSalaire.calculSalaireAnnuel(employe);
        Assert.assertNotEquals(0, salaireA, 0.0, "Ne devrait pas être égal à zéro");
    }//testCalculSalaireZero()
    @Test
    public void testEmail() {
        String mail = "aa@hesge.ch";
        Assert.assertEquals(employe.getEmail(), mail, "Devrait être égal");
    }//testCalculSalaireAnnuel()*/
}
