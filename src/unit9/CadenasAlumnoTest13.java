package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * M�todos de las pruebas para comprobar que el funcionamiento del m�todo posicionPrimeraCadena 
 * de la clase CadenasAlumno es el correcto
 */
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
