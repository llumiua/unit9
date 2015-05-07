package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest16 {

	@Test
	public void testConcatenaCadenas1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.concatenaCadenas("ca", "ca") == "ca".concat("ca"));
	}

	@Test
	public void testConcatenaCadenas2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.concatenaCadenas("ca", "catua") == "ca".concat("catua"));
	}
	
	@Test
	public void testConcatenaCadenas3() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.concatenaCadenas("hola", "cacatua") == "hola".concat("cacatua"));
	}

}
