package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luz Feliciano Sanjuan
 *  Métodos de las pruebas para comprobar que el funcionamiento del método reemplazaTodos 
	 * de la clase CadenasAlumno es el correcto
 *
 */
public class CadenasAlumnoTest5 {

	@Test
	public void testReemplazaTodos1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.reemplazaTodos("jamonmonmon", "mon", "bon") == "jamonmonmon".replaceAll("mon", "bon"));
	}

	@Test
	public void testReemplazaTodos2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.reemplazaTodos("monjaja", "je", "bon") == "monjaja".replaceAll("je", "bon"));
	}
}
