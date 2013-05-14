
public class TesteColecao {

	public static void main(String[] args) {
		Colecao c = new Colecao (10);
		c.addInicio("1");
		c.addInicio("2");
		c.addInicio("3");
		c.addInicio("4");
		c.addInicio("5");
		c.addNaPosicao("6", 1);
		c.removerInicio();
		c.remover(0);
		for (int i = 0; i < c.elementos.length; i++){
			System.out.println(c.elementos[i]);
		}
	}

}
