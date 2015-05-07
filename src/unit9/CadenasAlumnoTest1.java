package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest1 {

	@Test
	public void testSonIguales1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.sonIguales("entornos", "ento") == "entornos".equals("ento"));
	}
	
	@Test
	public void testSonIguales2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.sonIguales("ento","entornos") == "ento".equals("entornos"));
	}

	@Test
	public void testSonIguales3() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.sonIguales("entornos","sonrotne") == "entornos".equals("sonrotne"));
	}
	
	@Test
	public void testSonIguales4() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.sonIguales("entornos","entornos") == "entornos".equals("entornos"));
	}


	
}
