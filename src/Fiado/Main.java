package Fiado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.print("Informe o Telefone do cliente do cliente: ");
		String telefone = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome, telefone);
		
//		System.out.print("Informe o telefone do cliente");
//		consumidor.telefone = scanner.nextLine();


		System.out.print("Informe o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);
		
		int total = consumidor.getFiado();
		
		if (total > 100) {
			System.out.println("cliente " + consumidor.getNome() + " deve: " + total + " - ganhou brinde");
		} else {
			System.out.println("cliente " + consumidor.getNome() + "de " + consumidor.getTelefone( ) + " deve: " + total );
		}		
	}
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
	}

}
