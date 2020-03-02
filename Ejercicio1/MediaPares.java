package Ejercicio1;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		
		int x=0,y=0,numPar=0,numImpar=0;
		int []enteros;
		enteros =new int[10];
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0 ; i<enteros.length; i++) {
			
			System.out.println("Ingresa 10 numeros");
			enteros[i]=sc.nextInt();
		}
		
		
		
		
		for(int i=0 ; i<enteros.length; i++) {
			
			if(i%2==0) {
				
				x++;
				numPar=numPar+enteros[i];
				
			}else {
				
				y++;
				
			numImpar=numImpar+enteros[i];
			
			}
			
		}
		
		
		numPar=numPar/x;
		numImpar=numImpar/y;
		
		System.out.print("La media par es " + numPar+" la media impar es "+numImpar);
		
	}

}
