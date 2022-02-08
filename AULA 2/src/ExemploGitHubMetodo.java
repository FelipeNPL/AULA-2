import java.io.Closeable;
import java.util.Scanner;

public class ExemploGitHubMetodo {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		preencher(num); //argumento do metodo -> variavel q sera enviada
		int maior = maiorValor(num);
		int menor = menorValor(num);
		System.out.print("Vetor: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("Maior valor = "+maior);
		System.out.println("Menor valor = "+menor);
		
	}
	
	public static int maiorValor(int[] num) {
		int aux = num[0]; //nao precisa ser minimo possivel, pode ser o primeiro valor. NUNCA ZERO.
		for (int i = 1; i < num.length; i++) { //comecamos em 1 pois ja temos a primeira posicao
			if (aux < num[i]) {
				aux = num[i];
			}
		}
		return aux; //retorna o valor 
	}
	
	public static int menorValor(int[] num) {
		int aux = num[0]; 
		for (int i = 1; i < num.length; i++) { 
			if (aux > num[i]) {
				aux = num[i];
			}
		}
		return aux; 
	}
	
	public static void preencher (int[] num) {  // num eh um parametro do metodo -> o que vai receber
		Scanner le = new Scanner(System.in); //declaramos o scanner aqui pois sera AQUI que iremos usa-lo
		for (int i = 0; i < num.length; i++) {
			System.out.print("Insira um numero inteiro: ");
			num[i] = le.nextInt();
		}
		le.close();
	}
	
	 
	
	

}
