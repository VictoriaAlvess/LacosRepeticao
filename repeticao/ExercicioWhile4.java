package lacos.repeticao;

import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:
	o número de pessoas calmas;
	o número de mulheres nervosas;
	o número de homens agressivos;
	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos;
	o número de pessoas calmas com menos de 18 anos.
 */
public class ExercicioWhile4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, temperamento, contador=0, numCalmo=0, numMulherNervosa=0, numHomemAgre=0;
		int numOutrosCalmos=0, numJovemCalmos=0,  numAdultosNervoso=0;
		
		
		while(contador <= 5) {
			contador++;
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.println("Digite seu sexo, considerando 1-Feminino, 2-Masculino, 3- Outros: ");
			sexo = ler.nextInt();
			System.out.println("Digite seu temperamento, considerando 1-Calmo, 2-Nervoso, 3-Agressivo: ");
			temperamento = ler.nextInt();
			
			
			if(temperamento ==1) {
				numCalmo++;
				
			}if(sexo == 1 && temperamento == 2) {
				numMulherNervosa++;
				
			}if(sexo == 2 && temperamento == 3 ) {
				numHomemAgre++;
				
			}if(sexo == 3 && temperamento == 1) {
				numOutrosCalmos++;
				
			}if(idade> 40 && temperamento == 2) {
				numAdultosNervoso++;
				
			}if (idade <18 && temperamento == 1) {
				numJovemCalmos++;
			}
		}
		System.out.println("O número de pessoas calmas é de: " + numCalmo );
		System.out.println("O número de mulheres nervosas é de: " + numMulherNervosa );
		System.out.println("O número de homens agressivos é de: " + numHomemAgre );
		System.out.println("O número de pessoas não binárias calmas é de: " + numOutrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é de: " + numAdultosNervoso);
		System.out.println("O número de pessoas calmas com menos de 18 anos é de: " + numJovemCalmos );
		
	}

}
