package entornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	static Calculadora cal = new Calculadora();

	@BeforeAll // Se ejecuta una vez, antes de ejecutar los test
	static void setUpBeforeClass() throws Exception {
		cal = new Calculadora();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach // Se ejecuta una vez para cada repetición de los RepeatedTest
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSumaSimple() {
		Calculadora cal = new Calculadora();

		assertEquals(8, cal.suma(4, 5)); // Primer valor de todos, el resultado esperado, segundo la función a la que
											// llama
	}

	@DisplayName("Test multiple de la suma")
	@RepeatedTest(100)
	void testSumaRepetida() {

		int x = Calculadora.generarAleatorio();
		int y = Calculadora.generarAleatorio();

		assertEquals((x + y), cal.suma(x, y));
	}

	@DisplayName("Test multiple de la division") // Si lo pongo como int me da error, como float no
	@RepeatedTest(200)
	void testDivision() {
		float x = Calculadora.generarAleatorio();
		float y = Calculadora.generarAleatorio();

		assertEquals((x / y), Calculadora.division(x, y));
	}
}
