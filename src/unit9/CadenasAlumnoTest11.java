package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasAlumnoTest11 {

	@Test
	public void testEmpiezaCon1() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.empiezaCon("persepolis", "per") == "persepolis".startsWith("per"));
	}
	
	@Test
	public void testEmpiezaCon2() {
		System.out.println("Comparando dos cadenas...");
		CadenasAlumno cd1 = new CadenasAlumno();
		
		assertTrue(cd1.empiezaCon("persepolis", "pre") == "persepolis".startsWith("pre"));
	}
	

}
