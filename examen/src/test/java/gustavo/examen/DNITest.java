package gustavo.examen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DNITest {

	private static final String DNI_CORRECTO = "65726848R";
	private static final String DNI_INCORRECTO = "98880536262HHH";
	private static final String NUMERO_DNI = "65726848";
	private static final String LETRA_DE_CONTROL_CORRECTA = "R";
	private static final String LETRA_DE_CONTROL_INCORRECTA = "H";

	
	// Ejercicio 03
	// a
	@Test
	public void testDniCorrecto() {
		assertTrue(DNI.validarDni(DNI_CORRECTO));
	}

	@Test
	public void testDniIncorrecto() {
		assertFalse(DNI.validarDni(DNI_INCORRECTO));
	}
	
	// b
	@Test
	public void testLetraDeControlCorrecta() {
		assertEquals(LETRA_DE_CONTROL_CORRECTA, DNI.getLetraDni(NUMERO_DNI));
	}
	
	@Test
	public void testLetraDeControlIncorrecta() {
		assertEquals(LETRA_DE_CONTROL_INCORRECTA, DNI.getLetraDni(NUMERO_DNI));
	}

}
