package algoritmo.vetor.teste;

import algoritmo.vetor.aula.Vetor;

public class VetorTeste {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       Vetor vetor = new Vetor(10);
       vetor.addElementoVetor("valor 1");
       vetor.addElementoVetor("valor 2");
       vetor.addElementoVetor("valor 3");
       
       


       System.out.println(vetor.toString());

	}

}
