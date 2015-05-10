package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * Métodos de las pruebas para comprobar que el funcionamiento del método esMenor
 * de la clase CadenasAlumno es el correcto
 */
public class CadenasAlumnoTest3 {

	@Test
	public void testEsMenor1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.esMenor("entornos", "ento") == "entornos".compareTo("ento") < 0);
	}
	
	@Test
	public void testEsMenor2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.esMenor("ento","entornos") == "ento".compareTo("entornos") < 0);
	}
	
	@Test
	public void testEsMenor3() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.esMenor("entornos","sonrotne") == "entornos".compareTo("sonrotne") < 0);
	}

	@Test
	public void testEsMenor4() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.esMenor("entornos","entornos") == "entornos".compareTo("entornos") < 0);
	}
	
}
