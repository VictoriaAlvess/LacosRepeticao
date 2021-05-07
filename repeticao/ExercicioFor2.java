package lacos.repeticao;
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */
import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero, numeroPar=0, numeroImpar=0;
		 

		for (int i = 0; i <= 9; i++) {
			System.out.println("Digite os números: ");
			numero = ler.nextInt();
			
			if (numero %2 == 0) {
				numeroPar++;
			}else if (numero %2 == 1){
				numeroImpar++;
			}
		}
		System.out.println("Essa é a quantidade de números pares: " + numeroPar);
		System.out.println("Essa é a quantidade de números ímpares: " + numeroImpar);
	}
}
