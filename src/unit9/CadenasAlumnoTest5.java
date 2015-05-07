package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest5 {

	@Test
	public void testReemplazaTodos1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.reemplazaTodos("jamonmonmon", "mon", "bon") == "jamonmonmon".replaceAll("mon", "bon"));
	}

	public void testReemplazaTodos2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.reemplazaTodos("monjaja", "je", "bon") == "monjaja".replaceAll("je", "bon"));
	}
}
