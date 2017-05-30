import com.hesge.ajdini.maven_projet.domaine.Employe;
import com.hesge.ajdini.maven_projet.metier.GestionSalaire;
import org.junit.Before;
import org.junit.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Artrit
 */

public class TestMockito {
    @Mock
    private GestionSalaire gestSalaire;
    @Mock
    private Employe employe;
    
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculSalaire() {
    Mockito.when(gestSalaire.calculSalaireAnnuel(employe)).thenReturn(1000.00);

    //Mockito.verify(meteoDAO).saveTemperature(0, 10);
  }

    
}
