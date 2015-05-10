package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest14 {

	/**
	 * Luz Feliciano Sanjuan
	 *  Métodos de las pruebas para comprobar que el funcionamiento del método extraerSubstring 
	 * de la clase CadenasAlumno es el correcto
	 */
	@Test
	public void testExtraerSubstringStringInt1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.extraerSubstring("monada", 3) == "monada".substring(3));
	}
	


}
