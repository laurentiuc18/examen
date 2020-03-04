package Ejercicio3;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[]pares;
		pares=new int[20];
		int cont=0;
		
		for(int i=0; i<pares.length;i++) {
			cont=cont+2;
			pares[i]=cont;
			System.out.println( "El numero par guardado es: " + pares[i]);
			
		}

		
	}

}
