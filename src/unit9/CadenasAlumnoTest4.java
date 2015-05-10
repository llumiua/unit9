package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * Métodos de las pruebas para comprobar que el funcionamiento del método comparaIgnorandoMAyusculas 
	 * de la clase CadenasAlumno es el correcto
 */
public class CadenasAlumnoTest4 {

	@Test
	public void testComparaIgnorandoMayusculas1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.comparaIgnorandoMayusculas("entornos", "ento") == "entornos".equalsIgnoreCase("ento"));
	}
	
	@Test
	public void testComparaIgnorandoMayusculas2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.comparaIgnorandoMayusculas("ento","entornos") == "ento".equalsIgnoreCase("entornos"));
	}
	
	@Test
	public void testComparaIgnorandoMayusculas3() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.comparaIgnorandoMayusculas("entornos","sonrotne") == "entornos".equalsIgnoreCase("sonrotne"));
	}
	
	@Test
	public void testComparaIgnorandoMayusculas4() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.comparaIgnorandoMayusculas("entornos","entornos") == "entornos".equalsIgnoreCase("entornos"));
	}
	
}
