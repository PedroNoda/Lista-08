package lista08;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[5][5];
		
		for (int ln = 0; ln < a.length; ln++) {
			for (int cl = 0; cl < a.length; cl++) {
				a[ln][cl] = 0;
				if (ln == cl) {
					a[ln][cl] = 1;
				}
			}
		}
		
		for (int ln = 0; ln < a.length; ln++) {
			for (int cl = 0; cl < a.length; cl++) {
				System.out.printf("%d ", a[ln][cl]);
			}
			System.out.println(" ");
		}
		
		
		sc.close();
	}
}
