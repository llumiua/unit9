package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest7 {

	@Test
	public void testQuitaEspacios() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.quitaEspacios("hola que tal") == "hola que tal".trim());
	}

}
