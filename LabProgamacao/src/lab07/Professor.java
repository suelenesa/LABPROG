package lab07;

/* Aluna: Suelene Sa*/

/*Classe que define as caracterasticas de um professor */

public class Professor extends Contribuinte {

	private static final double ATE_UM_SALARIO = .05;
	private static final double ATE_CINCO_SALARIOS = .10;
	private static final double ACIMA_CINCO_SALARIOS = .20;
	private double despesas_material;
	private double salario;

	public Professor(String nome, String numero, boolean valorCasa, boolean ValorCarro, double VlBens, double salario,
			double despesas_material) throws Exception {
		super(nome, numero, valorCasa, ValorCarro, VlBens);
		validaDados(salario, despesas_material);
	}

	private void validaDados(double salario, double despesas_material) throws Exception {
		if (salario > 0) {
			this.salario = salario;
		} else {
			throw new Exception("Valor do salario do professor invalido.");
		}
		if (despesas_material >= 0) {
			this.despesas_material = despesas_material;
		} else {
			throw new Exception("Os gastos com materiais nao pode ser um valor negativo.");
		}

	}

	/* @return O salario do professo */
	public double getSalario() {
		return salario;
	}

	/*
	 * Retorna o valor total que o professor teve com materiais.
	 * 
	 * @return
	 */
	public double getDespesas_material() {
		return despesas_material;
	}

	public void setDespesas_material(double despesas_material) {
		this.despesas_material = despesas_material;
	}

	/* Calcula o valor do imposto que dever ser pago pelo professor */
	@Override
	protected double getTributacao() {

		double tributacao = 0.0;

		int numeroDeSalarios = (int) (this.salario / SALARIO_MINIMO);

		if (numeroDeSalarios <= 1)
			tributacao = salario * ATE_UM_SALARIO;
		else if (numeroDeSalarios > 1 && numeroDeSalarios <= 5)
			tributacao = salario * ATE_CINCO_SALARIOS;
		else
			tributacao = salario * ACIMA_CINCO_SALARIOS;

		return tributacao;
	}

	/* Calcula os descontos que serao aplicados ao professor. */
	@Override
	public double Descontos() {
		return (despesas_material * 0.5);
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.toString());
		string.append(String.format("\nSalario: R$ %,.2f", salario));
		string.append(String.format("\nGastos com materiais: R$ %,.2f\n", despesas_material));
		return string.toString();
	}
}
