import java.util.Scanner;

public class tabelaNutri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== TABELA NUTRICIONAL ========");
		System.out.println("Prato: ");
		System.out.println("1 - Vegetariano | 2- Peixe | 3- Frango | 4- Carne");
		int pra = sc.nextInt();
		System.out.println();
		System.out.println("Sobremesa: ");
		System.out.println("1- Abacaxi | 2- Sorvete Diet | 3- Mouse Diet | 4- Mouse Chocolate");
		int sob = sc.nextInt();
		System.out.println();
		System.out.println("Bebida: ");
		System.out.println("1- Chá | 2- Suco de Laranja | 3- Suco de Melão | 4- Refrigerante Diet");
		int beb = sc.nextInt();
		
		int cal1= 0;
		int cal2 = 0;
		int cal3 = 0;
		
		switch(pra) {
		case 1:
			cal1 = 180;
			break;
		case 2:
			cal1 = 230;
			break;
		case 3:
			cal1 = 250;
			break;
		case 4:
			cal1 = 350;
			break;
		default:
			System.out.println("Opção Inválida.");
			break;
		}
		
		switch(sob) {
		case 1:
			cal2 = 75;
			break;
		case 2:
			cal2 = 110;
			break;
		case 3:
			cal2 = 170;
			break;
		case 4:
			cal2 = 200;
			break;
		default:
			System.out.println("Opção Inválida.");
			break;

		}
		
		switch(beb) {
		case 1:
			cal3 = 20;
			break;
		case 2:
			cal3 = 70;
			break;
		case 3:
			cal3 = 100;
			break;
		case 4:
			cal3 = 65;
			break;
		default:
			System.out.println("Opção Inválida.");
			break;
	
		}
		
		int totalCal = cal1 + cal2 + cal3;
		System.out.println("Valor total de Calorias do Prato Selecionado: "+ totalCal);
		sc.close();

	}

}
