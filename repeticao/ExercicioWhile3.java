package lacos.repeticao;

/*
 * Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos 
   Total de pessoas com mais de 50 anos
   O programa termina quando idade for =-99.
 */
import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade, contador21 = 0, contador50 = 0;

		System.out.println("Digite as idades: ");
		idade = ler.nextInt();

		while (idade == -99) {
			if (idade < 21) {
				contador21++;

			} else if (idade > 50) {
				contador50++;

			}
			System.out.println("Digite a idade: (Caso queira encerrar o programa digite -99)");
			idade = ler.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + contador21);
		System.out.println("Total de pessoas com mais de 50 anos: " + contador50);

	}
}
