package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 * Métodos de las pruebas para comprobar que el funcionamiento del método quitaEspacios 
 * de la clase CadenasAlumno es el correcto
 */
public class CadenasAlumnoTest7 {

	@Test
	public void testQuitaEspacios() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.quitaEspacios("hola que tal") == "hola que tal".trim());
	}

}
