package atv;

import java.util.Scanner;
import java.util.Locale;

public class Atividade1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário");
		Float x;
		x = sc.nextFloat();
		System.out.println(x);
		1
		System.out.println("Digite o abono");
		Float y;
		y = sc.nextFloat();
		System.out.println(y);
		
		System.out.println("Novo salário= ");
		System.out.println(x + y);
		
		
		
		
		
		
		sc.close();
		
	}

}
