import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digte um numero inteiro");
		int n = ler.nextInt();

		ler.nextLine();
		System.out.println("Digite uma frase");
		String nome = ler.nextLine();

		for(int i=0; i  < n; i++)
		{
		System.out.println(nome);
		}
	}
}
