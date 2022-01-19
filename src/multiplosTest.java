import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MultiplosTest {

	@ParameterizedTest
	@ValueSource(doubles = {4, 6, 8})
	void testLeerN(double n) throws Exception {
		int resultado = multiplos.leerN();
		assertEquals(resultado, 10);
	}

	@Test
	void testLeerM() {
		int resultado = multiplos.leerM(2);
		assertEquals(resultado, 11);
	}

	@Test
	void testSiguienteMultiplo() {
		int resultado = multiplos.siguienteMultiplo(5, 20);
		assertEquals(resultado, 25);
	}

}