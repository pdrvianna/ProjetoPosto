
public class AppPosto {
	public static void main(String args[]) {
		BombaDeCombustivel b1 = new BombaDeCombustivel("Gasolina", 4.39);
		
		b1.abastecerPorLitro(45);
		b1.exibirRecibo();
		
		System.out.println("\n\n");
		b1.abastecerPorValor(150.0);
		b1.exibirRecibo();
	}

}
