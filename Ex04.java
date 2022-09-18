package lista08;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[5][5];
		int maior = 0;
		for (int ln = 0;  ln < a.length; ln++) {
			for (int cl = 0; cl < a.length; cl++) {
				System.out.println("LINHA: " + (ln+1) + " | COLUNA: "  +(cl+1) 
						+ " Informe um valor:");
						a[ln][cl] = sc.nextInt();
						if (ln == 0 && cl == 0){
							maior = a[ln][cl];
						}
						if(maior < a[ln][cl]) {
							maior = a[ln][cl];
						}
			}
		}
		
		for (int ln = 0; ln < a.length; ln++) {
			for (int cl = 0; cl < a.length; cl++) {
				if(a[ln][cl] == maior) {
					System.out.println("Maior(es) valor(es): " + maior + ", linha: "
							+ (ln+1) + ", coluna: " + (cl+1));
				}
			}
		}
		
		sc.close();
	}
}
