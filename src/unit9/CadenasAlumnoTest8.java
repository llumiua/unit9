package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * Métodos de las pruebas para comprobar que el funcionamiento del método convertirMayusculas 
	 * de la clase CadenasAlumno es el correcto
 */
public class CadenasAlumnoTest8 {

	@Test
	public void testConvertirMayusculas1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.convertirMayusculas("hola") == "hola".toUpperCase());
	}

	@Test
	public void testConvertirMayusculas2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.convertirMayusculas("Que") == "Que".toUpperCase());
	}
	
	@Test
	public void testConvertirMayusculas3() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.convertirMayusculas("TAL") == "TAL".toUpperCase());
	}

}
