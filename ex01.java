package application;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão inseridos? ");
		int n = sc.nextInt();
		
		if (n < 1 || n > 10) {
			System.out.println("ESCOLHA UM NÚMERO DE 1 A 10 E TENTE NOVAMENTE.");
		}
		else {
			int[] vect = new int[n];
			
			for (int i = 0; i < vect.length; i++) {
				
				System.out.printf("Informe o %dº número: ", i+1);
				vect[i] = sc.nextInt();
				
				}
			
			System.out.println("Números negativos:");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
			
		}
		
		sc.close();

	}

}
