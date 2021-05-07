package lacos.repeticao;
/*
 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
 */
public class ExercicioFor1 {

	public static void main(String[] args) {
		int divisao;

		for (int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {

				System.out.println("Segue os números divididos por 11 que obtem resto 5: " + i);
			}
		}
	}
}
