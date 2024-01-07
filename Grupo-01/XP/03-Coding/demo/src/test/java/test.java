
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import com.example.Archivo;
import com.example.Cuenta; 

public class test {

    //Iteración 1
    @Test
    public void testCreatePasswordAuto(){

        Cuenta cuenta1 = new Cuenta("Facebook", "1234");
        String passwordInicial = cuenta1.getContraseña();
        String passwordGenerada = cuenta1.generarContraseña();
        assertNotEquals(passwordInicial, passwordGenerada);
    }

    @Test
    public void testCreatePasswordManually() {
        Cuenta cuenta1 = new Cuenta("Facebook", "contrasena123");
        String passwordInicial = cuenta1.getContraseña();
        assertEquals("contrasena123", passwordInicial);
    }

    //Iteracion 2
    @Test
    public void testShowAllPasswords() {
        // Ruta temporal para el archivo de prueba
        String rutaArchivoPrueba = "Grupo-01/XP/03-Coding/demo/src/test/java/contrasena_prueba.txt";
        try{
            // Crear un gestor de contraseñas con el archivo de prueba
            Archivo manager = new Archivo(rutaArchivoPrueba);

            // Crear algunas contraseñas para el gestor (solo para propósitos de prueba)
            Cuenta cuenta1 = new Cuenta("Sitio1", "Password1");
            Cuenta cuenta2 = new Cuenta("Sitio2", "Password2");
            Cuenta cuenta3 = new Cuenta("Sitio3", "Password3");

            // Guardar las contraseñas en el archivo
            manager.guardarArchivo(cuenta1);
            manager.guardarArchivo(cuenta2);
            manager.guardarArchivo(cuenta3);

            // Obtener la lista de todas las contraseñas leyendo el archivo
            List<Cuenta> allPasswords = manager.getLista();

            // Verificar que la lista contiene las contraseñas esperadas
            assertTrue(allPasswords.contains(cuenta1));
            assertTrue(allPasswords.contains(cuenta2));
            assertTrue(allPasswords.contains(cuenta3));

            // Eliminar el archivo de prueba después de la prueba
            File archivoPrueba = new File(rutaArchivoPrueba);
            archivoPrueba.delete();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Excepción inesperada: " + e.getMessage());
        }
    }

    @Test
    public void testDeletePassword(){
        
    }
}
