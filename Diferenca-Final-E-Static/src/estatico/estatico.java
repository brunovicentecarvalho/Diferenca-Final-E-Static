package estatico;

public class estatico {
	//Um atributo static é definido como pertecente a forma da classe, não à instância dela, logo, seu valor é igual para todas as classes
	//instanciadas deste tipo. Exemplo :
	private static int valor = 0;
	public static int getValor() {
		return valor;
	}
	//Um atributo estático pode ser incrementado ou alterado. Exemplos:
	public void setValor(int novoValor) {
		valor = novoValor;
	}
	public void acrescentaUm() {
		valor++;
	}
	
	// Metodos Estáticos : (Explicarei a facilidade dele na classe principal)
	public static int somaValores(int valorASomar) {
		return valor + valorASomar;
	}
	//Porém metodos estáticos não conseguem chamar atributos "normais" da classe. Exemplo :
	public int exemplo1 = 1;
	//Descomentar o metódo abaixo para visualizar o erro;
//	public static int somaExemplo() {
//		return exemplo1 + valor;
//	}
	
}
