package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * Métodos de las pruebas para comprobar que el funcionamiento del método extraerSubstring 
 * de la clase CadenasAlumno es el correcto
 */
public class CadenasAlumnoTest15 {

	@Test
	public void testExtraerSubstringStringIntInt() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.extraerSubstring("monada", 3,5) == "monada".substring(3,5));
	}
	
	@Test
	public void testExtraerSubstringStringIntInt1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.extraerSubstring("monada", 3,7) == "monada".substring(3,7));
	}

}
