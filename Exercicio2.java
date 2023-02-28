import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Escreva uma frase");
		String frase = sc.nextLine();
		
		System.out.println("Digite o numero de vezes que deseja repetir");
		double num = sc.nextDouble();
		
		for(i =0; i < num; i++) 
		{
			System.out.println(frase);
		}
		

}
}
