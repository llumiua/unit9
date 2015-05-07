package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest6 {

	@Test
	public void testReemplazaPrimero1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.reemplazaPrimero("jamonmonmon", "mon", "bon") == "jamonmonmon".replaceFirst("mon", "bon"));
	}

	@Test
	public void testReemplazaPrimero2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.reemplazaPrimero("jabonbonbon", "mon", "mon") == "jabonbonbon".replaceFirst("mon", "mon"));
	}

}
