
public class Colecao {

	String elementos [];
	private int posicao = 0;
	
	public Colecao (int tam){
		elementos = new String [tam];
	}
	
	public void add (String e){
		if (posicao < elementos.length){
			elementos [posicao] = e;
			posicao++;
		}else{
			aumentaTamanhoArray(elementos);
			elementos [posicao] = e;
			posicao++;
		}
	}
	
	public void aumentaTamanhoArray (String elementos []){
		String elementos2 [] = new String [this.elementos.length+10];
		for (int i = 0; i < this.elementos.length; i++){
			elementos2 [i] = elementos [i];
		}
		elementos = elementos2;
	}
	
	public String getPosicao (int posicao){
		String num = elementos [posicao];
		return num;
	}
	
	public void addInicio (String num){
		int i;
		i = posicao - 1;
		for (; i >= 0; i--){
			elementos [i+1] = elementos[i];
		}
		elementos [0] = num;
		posicao++;
	}
	
	public void addNaPosicao (String num, int posicao){
		for (int i = this.posicao - 1; i >= posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = num;
		posicao++;
		
	}
	
	public void removerInicio(){
		
		for (int x = 0; x < this.posicao ; x++){
			this.elementos[x] = this.elementos[x+1];
		}
		elementos[this.posicao] = null;
		this.posicao--;
	}
	
	public void remover (int posicao){
		elementos[posicao] = null;
		for (int i = posicao; i <= this.posicao ; i++){
			elementos[i] = elementos[i+1];
		}
	}
}

