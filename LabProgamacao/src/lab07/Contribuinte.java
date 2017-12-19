package lab07;

/**
 * @Aluna Suelene Sa
 */
import java.util.List;

public abstract class Contribuinte {

	protected static final double SALARIO_MINIMO = 900;
	private String nome, numero; /* Nome e numero do Contribuinte */
	boolean valorCasa = false;
	private boolean valorCarro = false;
	protected double sinaisRiqueza, tributacao, descontos;
	public static int numeroDeContribuintes = 0;
	private double VlBens;

	/*
	 * @throws Exception Sera lancada caso alguma informacao passada ao
	 * construtor seja invalida
	 */
	public Contribuinte(String nome, String numero, boolean valorCarro, boolean valorCasa, double VlBens)
			throws Exception {
		validaDados(nome, numero, VlBens);
		this.valorCasa = valorCasa;
		this.valorCarro = valorCarro;
		numeroDeContribuintes++;
	}

	private void validaDados(String nome, String numero, double VlBens) throws Exception {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		} else {
			throw new Exception("O nome nao pode ser vazio.");
		}

		if (VlBens >= 0) {
			this.VlBens = VlBens;
		} else {
			throw new Exception("O valor dos bens nao pode ser negativo.");
		}
	}

	public static double calculaMediaDosBensDeContribuintes(List<?> lista) {
		int somaDosBens = 0;
		for (int i = 0; i < lista.size(); i++) {
			somaDosBens += ((Contribuinte) lista.get(i)).getVlBens();
		}
		double mediaDosBens = somaDosBens / lista.size();
		return mediaDosBens *= 1.5;
	}

	/* Retorna o nome do contribuinte. */
	public String getNome() {
		return nome;

	}

	/* @return O numero de cadastro do contribuinte. */
	public String getNumero() {
		return numero;
	}

	public boolean getValorcarro() {
		return valorCarro;
	}

	public boolean getValorcasa() {
		return valorCasa;

	}

	public double getVlBens() {
		return VlBens;
	}

	/* @return O numero de contribuintes ja cadastrados. */
	public static int numeroContribuintesCadastrados() {
		return numeroDeContribuintes;
	}

	public boolean sinaisExterioresDeRiquezaExcessivos(double mediaDosContribuintes) {
		double valorTotal = mediaDosContribuintes + (mediaDosContribuintes * 0.5);
		return VlBens > valorTotal;
	}

	/*
	 * @return O valor do desconto a ser aplicado sobre o tributo de um
	 * contribuinte
	 */
	protected abstract double Descontos();

	/* @return O valor devido do imposto a ser pago */
	protected abstract double getTributacao();

	public double getTributacaoTotal() {
		if (tributacao - descontos < 0)
			return 0;
		else
			return tributacao - descontos;
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Profissao do contribuinte: " + getClass().getSimpleName());
		string.append("\nNome do contribuinte: " + nome);
		string.append("\nNumero do contribuinte: " + numero);
		string.append(String.format("\nTem casa propria: %s", valorCasa ? "Sim" : "Nao"));
		string.append(String.format("\nTem carro proprio: %s", valorCarro ? "Sim" : "Nao"));
		string.append(String.format("\nValor total dos bens = R$ %,.2f", VlBens));
		return string.toString();
	}

}

