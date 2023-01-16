package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0.0;

		System.out.print("Quantos números irá digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Informe o %dº número: ", i + 1);
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}

		double media = soma / vect.length;

		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f | ", vect[i]);
		}
		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f%n", media);

		sc.close();

	}

}
