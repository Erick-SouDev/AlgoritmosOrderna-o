package algoritmo.vetor.teste;

import algoritmo.vetor.aula.Vetor;

public class VetorTeste {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(10);
		vetor.addVectorElement("valor 1");
		vetor.addVectorElement("valor 2");
		vetor.addVectorElement("valor 3");
		vetor.addVectorElement("valor 4");

		System.out.println(vetor.toString());

	}

}
