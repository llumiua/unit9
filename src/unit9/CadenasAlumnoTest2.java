package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest2 {

	@Test
	public void testEsMayor1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.esMayor("entornos", "ento") == "entornos".compareTo("ento") > 0);
	}
	
	@Test
	public void testEsMayor2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.esMayor("ento","entornos") == "ento".compareTo("entornos") > 0);
	}
	
	@Test
	public void testEsMayor3() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.esMayor("entornos","sonrotne") == "entornos".compareTo("sonrotne") > 0);
	}

	@Test
	public void testEsMayor4() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.esMayor("entornos","entornos") == "entornos".compareTo("entornos") > 0);
	}
	


}
