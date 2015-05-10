package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * Métodos de las pruebas para comprobar que el funcionamiento del método longitudCadena 
 * de la clase CadenasAlumno es el correcto
 */
public class CadenasAlumnoTest10 {

	@Test
	public void testLongitudCadena1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.longitudCadena("hola") == "hola".length());
	}
	
	@Test
	public void testLongitudCadena2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.longitudCadena("holas") == "hola".length());
	}
	
	@Test
	public void testLongitudCadena() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.longitudCadena("hola") == "mala".length());
	}

}
