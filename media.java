// Criação de média para estudo

import java.util.Scanner;
public class media {
	int nota;

	public static void main(String[] args) {
		System.out.println("Este é um Programa de Média criado para estudo"); 
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
		//Se a nota for até 3 - Mostrar reprovado
		//Se a nota for de 3 até 7 - Mostrar Exame
		//Se a nota for de 7 até 10 - Mostrar Aprovado
		
			if (media < 3)
					System.out.println("Reprovado");
			else		
			if (media < 7)
					System.out.println("Exame");
			else
				if (media > 7)
					System.out.println("Aprovado");
	}

}
