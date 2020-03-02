package ejercicio0;

import java.util.Scanner;

public class Ejercicio0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int pos=0,neg=0,x=0,y=0;
		int[] temperaturas;
		temperaturas=new int [10];
		
		for (int i = 0; i < 10; i++) {
            System.out.print("numeros");
            temperaturas[i]=sc.nextInt();
		}
		for(int i =0; i< 10; i++) {
			
			if(temperaturas[i]>=0) {
				x++;
				pos=temperaturas[i]+pos;
			}else {
				y++;
				neg=temperaturas[i]+neg;
			}
		}
		
		pos=pos/x;
		neg=neg/y;
		
		System.out.print("La media positiva es " + pos+" la media negativa es "+neg);
	}

}
