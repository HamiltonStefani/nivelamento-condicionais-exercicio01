package exercciciospropostos04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner cs = new Scanner(System.in);
		
		int A, B;
		System.out.println("Digite o primeiro número: ");
		A = cs.nextInt();
		System.out.println("Digite o segundo número: ");
		B = cs.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println(" O RESULTADO É: MULTIPLO");
		}else {
			System.out.println("O RESULTADO É: NÃO É MULTIPLO");
		}
		
		
		
		cs.close();

	}

}
