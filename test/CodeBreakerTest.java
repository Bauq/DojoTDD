
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Carolina Isaza
 * @author Sebastián Jiménez
 * @author Brian Uribe
 *
 */
public class CodeBreakerTest {
	CodeBreaker codeBreaker;
	String resultado = "";

	@Before
	public void setup() {
		codeBreaker = new CodeBreaker();
	}

	@Test
	public void testTodosEnPosicionCorrecta() {
		resultado = codeBreaker.adivinarNumero(4532);
		assertEquals("XXXX", resultado);
	}

	@Test
	public void testUnNumeroBien() {
		resultado = codeBreaker.adivinarNumero(4896);
		assertEquals(resultado, "X");
	}

	@Test
	public void testDosNumerosBien() {
		resultado = codeBreaker.adivinarNumero(4578);
		assertEquals(resultado, "XX");
	}

	@Test
	public void testUnoBienEnDesorden() {
		resultado = codeBreaker.adivinarNumero(8388);
		assertEquals("_", resultado);
	}

	@Test
	public void testDosBienEnDesorden() {
		resultado = codeBreaker.adivinarNumero(8356);
		assertEquals("__", resultado);
	}

	@Test
	public void testTodosBienEnDesorden() {
		resultado = codeBreaker.adivinarNumero(2354);
		assertEquals("____", resultado);
	}

	@Test
	public void testNingunoBien() {
		resultado = codeBreaker.adivinarNumero(9999);
		assertEquals("", resultado);
	}

	@Test
	public void testUnoBienEnPosicionUnoEnDesorden() {
		resultado = codeBreaker.adivinarNumero(4299);
		assertEquals("X_", resultado);
	}

	@Test
	public void testDosBienDosDesorden() {
		resultado = codeBreaker.adivinarNumero(3542);
		assertEquals("XX__", resultado);
	}

}
