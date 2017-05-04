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
        employe.setAge(25);
        employe.setSalaire(7000);
    }//setUp()

    @Test
    public void testCalculSalaireAnnuel() {
        double salaireA = gestSalaire.calculSalaireAnnuel(employe);
        Assert.assertEquals(84000, salaireA, 0.0, "7000");
    }//testCalculSalaireAnnuel()
}
