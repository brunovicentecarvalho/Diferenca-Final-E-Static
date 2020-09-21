package finale;

public class Fim {
	//Atributos final, pertencem as instancias da classe e não a classe. Os valores destes atributos podem ser declarados
		//apenas uma vez.
		public final int valor = 1;
		//Exemplo de erro ao tentar incrementar um atributo final:(Descomentar para visualizar)
//		public void erro(){
//			valor++;
//		}
		public int getValor() {
			return valor;
		}
		//Porém estes atributos podem ser lidos sem alguma excessão.
		public int somaValores(int valorChamado) {
			return valor + valorChamado;
		}
		//Métodos finais: 
		public final int somaValor(int valorParam) {
			return valor + valorParam;
		}
		//Tais métodos não podem ser alterados em classes filhas. Exemplo de herança na outra classe;
}
