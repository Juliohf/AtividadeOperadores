package atv;

import java.util.Scanner;
import java.util.Locale;


public class Atividade2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		Float nota1,nota2,nota3,nota4,media;
		
		System.out.println("Insira nota 1:");
		nota1 = sc.nextFloat();
		
		System.out.println("Insira nota 2:");
		nota2 = sc.nextFloat();
		
		System.out.println("Insira nota 3:");
		nota3 = sc.nextFloat();
		
		System.out.println("Insira nota 4:");
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("A média é : %.2f%n", media);
		
		sc.close();

		
		

	}

}
