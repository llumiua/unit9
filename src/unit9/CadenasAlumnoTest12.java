package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * M�todos de las pruebas para comprobar que el funcionamiento del m�todo acabaEn 
 * de la clase CadenasAlumno es el correcto
 */
public class CadenasAlumnoTest12 {

	@Test
	public void testAcabaEn1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.acabaEn("mariquita", "ita") == "mariquita".endsWith("ita"));
	}
	
	@Test
	public void testAcabaEn2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.acabaEn("mariquita", "ota") == "mariquita".endsWith("ota"));
	}
	
	@Test
	public void testAcabaEn3() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.acabaEn("mariquita", "itu") == "mariquita".endsWith("itu"));
	}

}
