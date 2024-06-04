package atv;

import java.util.Scanner;
import java.util.Locale;

public class Atividade4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Float n1,n2,n3,n4,diferença;
		
		System.out.println("Insira o valor de n1:");
		n1 = sc.nextFloat();
				
		System.out.println("Insira o valor de n2:");
		n2 = sc.nextFloat();
				
		System.out.println("Insira o valor de n3:");
		n3 = sc.nextFloat();
		
		System.out.println("Insira o valor de n4:");
		n4 = sc.nextFloat();
		
		diferença = (n1 * n2) - (n3 * n4);
		System.out.println("A diferença é:");
		System.out.printf("%.2f%n", diferença);
		
		sc.close();

		
		
	}

}
