package lista08;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[4][4];
		int maiores = 0;
		
		for (int lin = 0; lin < a.length; lin++) {
			for (int col = 0; col < a.length; col++) {
				System.out.println("Linha: " + (lin+1) + " | Coluna : " + (col+1) + 
						" Informe um valor:");
				a[lin][col] = sc.nextInt();
				if(a[lin][col] > 10) {
					maiores++;
				}
			}
		}
		
		System.out.println("Quantidade de numeros maiores que 10: " + maiores);
		
		sc.close();
	}
}
