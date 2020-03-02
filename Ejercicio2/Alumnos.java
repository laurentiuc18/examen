package Ejercicio2;

import java.util.Scanner;

public class Alumnos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cantidad;
		double media=0,cont=0;
		double []nota;
		
		System.out.println("Cuantos alumnos hay?");
		cantidad=sc.nextInt();
		
		nota =new double[cantidad];
		
		
		
		for(int i=0 ; i<nota.length; i++) {
			
			System.out.println("Ingresa las notas");
			nota[i]=sc.nextDouble();
		}

		
		for(int i=0 ; i<nota.length; i++) {
			
			media=media+nota[i];
			cont++;
		}
			
		media=media/cont;
		System.out.println("La nota media es " +media);
		
		for(int i=0 ; i<nota.length; i++) {
			if (nota[i]>media)
			System.out.println( "Las notas mayores que la media son:" + nota[i]);
		}
		
	}

}
