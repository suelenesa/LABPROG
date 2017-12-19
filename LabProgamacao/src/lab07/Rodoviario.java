package lab07;
/* Aluna: Suelene Sa */

public abstract class Rodoviario extends Contribuinte {
	static double quilometro;
	protected static final double DESCONTO_POR_QUILOMETRO = 0.01;

	public Rodoviario(String nome, String numero, boolean valorCarro, boolean valorCasa, double VlBens,
			double quilometro) throws Exception {
		super(nome, numero, valorCarro, valorCasa, VlBens);
		setquilometo(quilometro);

	}

	private void setquilometo(double quilometro) throws Exception {
		if (quilometro >= 0) {
			Rodoviario.quilometro = quilometro;
		} else {
			throw new Exception("Valor da quilometragem invalida.");
		}
	}

	/* @return A quilometragem percorrida por um rodoviario */
	public double getquilometro() {
		return quilometro;
	}

	/* Calcula os descontos que serao aplicados aos rodoviarios */
	protected double Descontos() {
		return (quilometro * DESCONTO_POR_QUILOMETRO);
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.toString());
		string.append(String.format("\nQuilometragem total percorrida: %,.1f km", quilometro));
		return string.toString();
	}

}

