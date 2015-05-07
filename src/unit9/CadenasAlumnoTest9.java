package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest9 {

	@Test
	public void testConvertirMinusculas1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.convertirMinusculas("hola") == "hola".toLowerCase());
	}

	@Test
	public void testConvertirMinusculas2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.convertirMinusculas("QUE") == "QUE".toLowerCase());
	}
	
	@Test
	public void testConvertirMinusculas3() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.convertirMinusculas("Tal") == "Tal".toLowerCase());
	}


	

}
