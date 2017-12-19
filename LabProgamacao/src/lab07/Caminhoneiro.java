package lab07;

/**
 * @Aluna Suelene Sa
 *        Classe que define todas as caracteristicas de um Caminhoneiro.
 */
public class Caminhoneiro extends Rodoviario {
	private static final double TAXA_FIXA = 500.0;
	private static final double TAXA_ACIMA_DE_10_TONELADAS = 100.0;
	private static final int DEZ_TONELADAS = 10;
	private double numeroDeToneladasPorAno;

	public Caminhoneiro(String nome, String numero, boolean valorCasa, boolean valorCarro, double VlBens,
			double quilometro, int numeroDeToneladasPorAno) throws Exception {
		super(nome, numero, valorCasa, valorCarro, VlBens, quilometro);
		setnumeroDeToneladasPorAno(numeroDeToneladasPorAno);
	}

	private void setnumeroDeToneladasPorAno(int numeroDeToneladasPorAno) throws Exception {

		if (numeroDeToneladasPorAno >= 0) {
			this.numeroDeToneladasPorAno = numeroDeToneladasPorAno;
		} else {
			throw new Exception("O numero de toneladas transportadas nao pode ser menor que zero");
		}
	}

	/* @return A quantidade de toneladas transportadas */
	public double getnumeroDeToneladasPorAno() {
		return numeroDeToneladasPorAno;
	}

	/*
	 * Calcula o devido valor do imposto que devera ser pago pelo caminhoneiro
	 */
	@Override
	protected double getTributacao() {

		double tributacao = 0.0;

		if (this.numeroDeToneladasPorAno <= DEZ_TONELADAS) {
			tributacao = TAXA_FIXA;
		} else {
			tributacao = TAXA_FIXA + (this.numeroDeToneladasPorAno - DEZ_TONELADAS) * TAXA_ACIMA_DE_10_TONELADAS;
		}

		return tributacao;

	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.toString());
		string.append(String.format("\nTotal de toneladas transportadas: %,.1f T\n", numeroDeToneladasPorAno));
		return string.toString();
	}

}
