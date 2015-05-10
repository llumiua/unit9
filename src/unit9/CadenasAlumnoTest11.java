package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * Métodos de las pruebas para comprobar que el funcionamiento del método empiezaCon 
 * de la clase CadenasAlumno es el correcto
 */
public class CadenasAlumnoTest11 {

	@Test
	public void testEmpiezaCon1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.empiezaCon("persepolis", "per") == "persepolis".startsWith("per"));
	}
	
	@Test
	public void testEmpiezaCon2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.empiezaCon("persepolis", "pre") == "persepolis".startsWith("pre"));
	}
	

}
