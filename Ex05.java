package lista08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[5][5];
		int b = 0;
		int menu = 0;

		while (menu != 3) {
			System.out.println("1-Gerar matriz predefinida");
			System.out.println("2-Informar valores da matriz");
			System.out.println("3-Sair");
			menu = sc.nextInt();
			if (menu == 1) {
				for (int ln = 0; ln < a.length; ln++) {
					for (int cl = 0; cl < a.length; cl++) {
						b++;
						a[ln][cl] = b++;
					}
				}
			break;	
			}else if (menu == 2) {
					for (int ln = 0; ln < a.length; ln++) {
						for (int cl = 0; cl < a.length; cl++) {
							System.out.printf("linha : %d | coluna : %d", (ln+1), (cl+1));
							System.out.println("Buscar um valor: ");
							a[ln][cl] = sc.nextInt();
						}
					}
			break;			
			} else if (menu == 3) {
						System.exit(0);
			} else{
						System.out.println("Valor Inválido");
						System.exit(0);
			}
		}

				for (int ln = 0; ln < a.length; ln++) {
					for (int cl = 0; cl < a.length; cl++) {
						System.out.printf("[%d], ", a[ln][cl]);
					}
					System.out.println(" ");
				}

				System.out.println("Informe um valor: ");
				int valor = sc.nextInt();
				boolean encontrado = false;

				for (int ln = 0; ln < a.length; ln++) {
					for (int cl = 0; cl < a.length; cl++) {
						if (a[ln][cl] == valor) {
							encontrado = true;
							System.out.println("Encontrado! , linha: " + (ln + 1) + ", coluna: " + (cl + 1));
						}
					}
				}

				if (encontrado == false) {
					System.out.println("Não encontrado!");
				}
				sc.close();
			}
		}
