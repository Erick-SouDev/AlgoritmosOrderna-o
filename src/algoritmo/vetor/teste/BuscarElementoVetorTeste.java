package algoritmo.vetor.teste;

import algoritmo.vetor.aula.Vetor;

public class BuscarElementoVetorTeste {
	public static void main(String[] args) throws Exception {

		Vetor vetor = new Vetor(10);
		vetor.addVectorElement("valor 1");
		vetor.addVectorElement("valor 2");
		vetor.addVectorElement("valor 3");
		vetor.addVectorElement("valor 4");

		var existe = vetor.checkElementExists("valor 1");
		var posicaoVetor = vetor.searchPositionElementVector("valor 6");
		System.out.println(posicaoVetor);

		
		System.out.println(vetor.getValueByIndexVector(3));
	}
}
