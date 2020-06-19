
public class BombaDeCombustivel {
	private String nome;
	private double vlLitro;
	private double vlTotal;
	private double qtdLitros;
	public BombaDeCombustivel(String nome, double vlLitro) {
		super();
		this.nome = nome;
		this.vlLitro = vlLitro;
		this.vlTotal = 0.0;
		this.qtdLitros = 0.0;
	}
	

	public void abastecerPorLitro(double qtdLitros) {
		this.qtdLitros = qtdLitros; 
		this.vlTotal = qtdLitros*vlLitro;
	}
	
	public void abastecerPorValor(double total) {
		this.vlTotal = total;
		this.qtdLitros = total/vlLitro;
	}
	
	public void exibirRecibo() {
		System.out.println("******* Posto IsidroCorp Gas & Energy ****");
		System.out.println(" Combustivel    "+nome);
		System.out.println(" Valor Litro R$ "+String.format("%.2f",vlLitro));
		System.out.println(" Quantidade     "+String.format("%.5f",qtdLitros));
		System.out.println(" Valor Total R$ "+String.format("%.2f",vlTotal));
		System.out.println("******************************************");
	}
}
