package lacos.repeticao;
/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */
import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero, numeroPar=0, numeroImpar=0;
		 

		for (int i = 0; i <= 9; i++) {
			System.out.println("Digite os n�meros: ");
			numero = ler.nextInt();
			
			if (numero %2 == 0) {
				numeroPar++;
			}else if (numero %2 == 1){
				numeroImpar++;
			}
		}
		System.out.println("Essa � a quantidade de n�meros pares: " + numeroPar);
		System.out.println("Essa � a quantidade de n�meros �mpares: " + numeroImpar);
	}
}
