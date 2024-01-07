
import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Cuenta; 

public class test {
    @Test
    public void testCreatePassword(){

        Cuenta cuenta1 = new Cuenta("Facebook", "1234");
        String passwordInicial = cuenta1.getContraseña();
        String passwordGenerada = cuenta1.generarContraseña();
        assertEquals(passwordInicial, passwordGenerada);
    }

    
}
