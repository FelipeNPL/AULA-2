
import java.util.Random;


public class ExemploGitHub {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int[] num = new int[5];
		int maior = 0;
		int menor = 10;

		//entrar valores
		System.out.println("Insira 5 valores inteiros: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = gerador.nextInt(10);
		}
		
		//maior e menor
		for (int i = 0; i < num.length; i++) {
			if (num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
		}
		
		//saida
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t "+num[i]);
		}
		System.out.println();
		System.out.println("Maior valor = "+maior);
		System.out.println("Menor valor = "+menor);
		
		
	}

}
