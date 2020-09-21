package visao;
import estatico.*;
import finale.*;
import constante.*;
import java.util.Scanner;
public class Visao {
	public static void main(String[] args) {
		int soma = 0, exemplo = 0;
		int b = 0;
		Scanner leia = new Scanner(System.in);
		estatico exemploStatic = new estatico();
		estatico exemEstatico2 = new estatico();
		Fim exFinal = new Fim();
		ExemploConstante exCons = new ExemploConstante();
		while(b!=9) {
			System.out.println("1- Somar em estatico");
			System.out.println("2- Acrescenta um(estatico)");
			System.out.println("3- Modificar o valor do estatico");
			System.out.println("4- Capturar valor estatico");
			System.out.println("5- Comparar valor estatico em duas instancias :");
			System.out.println("6- Capturar valor final");
			System.out.println("7- Capturar constante");
			System.out.println("9- Sair menu");
			b = leia.nextInt();
			switch (b) {
			case 1:
				System.out.println("Valor a somar :");
				soma = leia.nextInt();
				System.out.println("Soma :" + estatico.somaValores(soma));
				//Como podemos perceber, o metodo somaValores pertence a classe estatico. Exemplo de warning ao tentar instanciar 
				//o metodo abaixo :
				System.out.println("Soma :" + exemploStatic.somaValores(soma));
				//Por mais que o método pertença a classe e não a instancia, o Java ainda nos deixa fazer a chamada do mesmo.
				break;
			case 2:
				exemploStatic.acrescentaUm();
				System.out.println("Valor acrescentado 1 :" + estatico.getValor());
				break;
			case 3:
				System.out.println("Novo valor do estatico : ");
				exemplo = leia.nextInt();
				System.out.println("Valor estatico :"+ estatico.getValor());
				break;
			case 4: 
				System.out.println("Valor estatico (Na classe): "+ estatico.getValor());
				break;
			case 5: 
				System.out.println("Valor estatico (Instancia 1) : "+ exemploStatic.getValor());
				System.out.println("Valor estatico (Instancia 2) : "+ exemEstatico2.getValor());
				// Reparar que o Java nos apresenta um warning avisando que estamos chamando um metodo estatico atraves
				// de uma herança
			case 6:
				System.out.println("Valor final :" + exFinal.valor);
				// Reparar que é próprio da instancia, logo pode ser chamado sem nenhum warning
			case 7:
				System.out.println("Valor constante :"+ exCons.valor);
				// Reparar que o constante por também ser estatico tambem apresenta um warning ao ser chamado pela instancia
				System.out.println("Valor constante (Através da classe)"+ ExemploConstante.valor);
				break;
			}
			
		
		}
	}
}
