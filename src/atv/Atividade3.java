package atv;

import java.util.Scanner;
import java.util.Locale;

public class Atividade3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		
		System.out.println("Insira o salário bruto:");
		salarioBruto = sc.nextFloat();
				
		System.out.println("Insira o adicional Noturno:");
		adicionalNoturno = sc.nextFloat();
				
		System.out.println("Insira as horas extras:");
		horasExtras = sc.nextFloat();
		
		System.out.println("Insira os descontos:");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.println("O salário liquido é:");
		System.out.printf("%.2f%n", salarioLiquido);
		
		sc.close();

		
		
	}

}
