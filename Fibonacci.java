import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if(pertenceFibonacci(numero)) {
			System.out.println("O numero " + numero + " pertence a sequência de Fibonacci!");
		} else {
			System.out.println("O numero " + numero + " não pertence a sequência de Fibonacci!");
		}
		
		entrada.close();
	}

	private static boolean pertenceFibonacci(int numero) {
		int a = 0;
		int b = 1;
		int proximo = 0;
		
		if(numero == a || numero == b) {
			return true;
		} else {
			while(numero > proximo) {
				proximo = a + b;
				a = b;
				b = proximo;
			}
		}
		
		if(numero == proximo) {
			return true;
		} else {
			return false;
		}
	}
}
