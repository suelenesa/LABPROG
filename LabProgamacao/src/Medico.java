package lab07;

/* @author Suelene Sa*/
public class Medico extends Contribuinte {

	private static final double TAXA_POR_PACIENTE = 10.0;
	private double gastosCongressos;
	private int numeroDePacientes;

	public Medico(String nome, String numero, int numeroDePacientes, boolean valorCarro, boolean valorCasa,
			double VlBens) throws Exception {
		super(nome, numero, valorCarro, valorCasa, VlBens);
		validaDados(numeroDePacientes, gastosCongressos);
	}

	private void validaDados(int numeroDePacientes, double gastosCongressos) throws Exception {
		if (numeroDePacientes >= 0) {
			this.numeroDePacientes = numeroDePacientes;
		} else {
			throw new Exception("O numero de pacientes atendidos pelo medico nao pode ser negativo.");
		}
		if (gastosCongressos >= 0) {
			this.gastosCongressos = gastosCongressos;
		} else {
			throw new Exception("O total de gastos em congressos do medico nao pode ser negativo.");
		}

	}

	/* @return O numero de pacientes que o medico atendeu. */
	public int getPacientes() {
		return numeroDePacientes;
	}

	public double getGastosCongressos() {
		return gastosCongressos;
	}

	/* Calcula os descontos que serao aplicados ao medico. */
	protected double Descontos() {
		return this.gastosCongressos;
	}

	/* Calcula o devido valor do imposto que devera ser pago pelo medico. */
	@Override
	protected double getTributacao() {
		return this.numeroDePacientes * TAXA_POR_PACIENTE;

	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.toString());
		string.append("\nNumero de pacientes atendidos: " + numeroDePacientes);
		string.append(String.format("\nTotal de gastos em congressos: R$ %,.2f\n", gastosCongressos));
		return string.toString();
	}

}
