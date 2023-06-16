package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade19 {

	public static void main(String[] args) {
		
		 // Foguetinho
		
		 Scanner teclado = new Scanner(System.in);
		
		
		 System.out.println("------------------------------------");
	     System.out.println("         Valores da Matriz A        ");
	     System.out.println("------------------------------------");
	     System.out.println();
	     
	     int i = 0;
	     int matrizA[] = new int[6];
	     int matrizB[] = new int[6];
	     int matrizC[] = new int[6];
	     
	     
	     while(i < matrizA.length) {
	    	 System.out.print("Insira o valor (" + (i + 1) + "): ");
	    	 matrizA[i] = teclado.nextInt();
	    	 System.out.println();
	    	 i++ ; 
	     }
	     
	     i = 0;
	     while(i < matrizB.length) {
	    	 System.out.print("Insira o valor (" + (i + 1) + "): ");
	    	 matrizB[i] = teclado.nextInt();
	    	 System.out.println();
	    	 i++ ; 
	     }
	     
	     int c = 0;
	     
	     while(c < matrizB.length) {
	    	 
	    	 matrizC[c] = matrizA[c] - matrizB[c];
		     c++;
		     
	    	 System.out.println("A subtração dos valores é igual á: " + matrizC[c]);
	     }
	     
	}

}
