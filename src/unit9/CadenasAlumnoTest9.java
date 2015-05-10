package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * Métodos de las pruebas para comprobar que el funcionamiento del método convertirMinusculas 
 * de la clase CadenasAlumno es el correcto
 */
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
