import java.util.Scanner;

public class ContaA{
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com uma string: ");
		String texto = entrada.nextLine();
		
		int quantidade = contaCaractereA(texto);
		
		if(quantidade == 0) {
			System.out.println("O caractere 'A' não aparece na string!");
		} else {
			System.out.println("O caractere 'A' aparece " + quantidade + " vezes na string!");
		}
		
		entrada.close();
	}

	public static int contaCaractereA(String texto) {
		int cont = 0;
		
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
				cont++;
			}
		}
		
		return cont;
	}
}
