// Cria��o de m�dia para estudo

import java.util.Scanner;
public class media {
	int nota;

	public static void main(String[] args) {
		System.out.println("Este � um Programa de M�dia criado para estudo"); 
		Scanner entrada = new Scanner (System.in);
		double n1,n2,n3,n4,media;
		System.out.println("Insira o primeiro valor");
		n1 = entrada.nextDouble();
		System.out.println("Insira o segundo valor");
		n2 = entrada.nextDouble();
		System.out.println("Insira o terceiro valor");
		n3 = entrada.nextDouble();
		System.out.println("Insira o quarto valor");
		n4 = entrada.nextDouble();
		media = ((n1+n2+n3+n4)/4);
		System.out.println(media);
		//Se a nota for at� 3 - Mostrar reprovado
		//Se a nota for de 3 at� 7 - Mostrar Exame
		//Se a nota for de 7 at� 10 - Mostrar Aprovado
	}

}
