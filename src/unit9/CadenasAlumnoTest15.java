package unit9;

import static org.junit.Assert.*;

import org.junit.Test;

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
