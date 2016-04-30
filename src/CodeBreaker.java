
/**
 * @author Carolina Isaza
 * @author Sebastián Jiménez
 * @author Brian Uribe
 *
 */
public class CodeBreaker {

	public static final String numeroReal = "4532";
	private String resultado = "";

	public String adivinarNumero(int numeroMagico) {
		String numero = Integer.toString(numeroMagico);
		Character s = null;
		for (int i = 0; i < numero.length(); i++) {
			s = numero.charAt(i);
			contieneNumero(s, i);
			ordenarResultado();
		}
		return resultado;
	}

	private void contieneNumero(Character numeroInterno, int posicion) {
		Character n = null;
		for (int i = 0; i < numeroReal.length(); i++) {
			n = numeroReal.charAt(i);
			if (n.equals(numeroInterno)) {
				if (i != posicion) {
					resultado += "_";
				} else {
					resultado += "X";
				}
			}
		}
	}

	private void ordenarResultado() {
		String resultadoOrdenado = "";
		for (int i = 0; i < resultado.length(); i++) {
			Character letraRes = resultado.charAt(i);
			switch (letraRes) {
			case 'X':
				resultadoOrdenado = "X" + resultadoOrdenado;
				break;
			case '_':
				resultadoOrdenado = resultadoOrdenado + "_";
				break;
			default:
				break;

			}
		}
		resultado = resultadoOrdenado;
	}
}
