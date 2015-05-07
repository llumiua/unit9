package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest13 {

	@Test
	public void testPosicionPrimeraCadena1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.posicionPrimeraCadena("holaquetal", "e") == "holaquetal".indexOf("e"));
	}
	
	@Test
	public void testPosicionPrimeraCadena2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.posicionPrimeraCadena("holaquetal", "l") == "holaquetal".indexOf("l"));
	}

}
