package algoritmo.vetor.teste;

import algoritmo.vetor.aula.Vetor;

public class BuscarElementoVetorTeste {
	public static void main(String[] args) throws Exception {

		Vetor vetor = new Vetor(10);
		vetor.addElementoVetor("valor 1");
		vetor.addElementoVetor("valor 2");
		vetor.addElementoVetor("valor 3");
		vetor.addElementoVetor("valor 4");

		
		System.out.println(vetor.getValuePorIndexVetor(3));
	}
}
