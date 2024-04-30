package algoritmo.exercicios;

import java.util.Random;


public class InsertionSort {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int i , esquerda , eleito;
		Random random = new Random();
		for(i = 0 ; i <vetor.length  ;i++) {
			vetor[i] = random.nextInt(300)+1;
			
		}
		
		for(i = 0 ; i <vetor.length  ;i++) {
			System.out.println( vetor[i] );
			
		}
		
		for(int posInicial = 1 ; posInicial <=9; posInicial++) {
			eleito = vetor[posInicial];
			esquerda = posInicial -1;
			
			while (esquerda >= 0 && vetor[esquerda] > eleito) {
				
				vetor[esquerda + 1] = vetor[esquerda];
				esquerda--;
			}
			vetor[esquerda + 1] = eleito;
		
		}
         System.out.println("--------------------ordenado----------------------");
		for(i = 0 ; i <vetor.length  ;i++) {
			System.out.println( vetor[i] );
			
		}
		
	}
	
}
