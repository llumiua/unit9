package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

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
