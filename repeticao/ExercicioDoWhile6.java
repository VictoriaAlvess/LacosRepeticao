package lacos.repeticao;

import java.util.Scanner;

/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado.E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. 
Para sair digitar(zero)
 */
public class ExercicioDoWhile6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 0, numero, media, soma = 0;

		do {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();

			if (numero % 3 == 0) {
				soma += numero;
				i++;
			}
		} while (numero != 0);

		media = soma / i;

		System.out.println("A m�dia dos n�meros digitados � igual a: " + media);
	}
}
