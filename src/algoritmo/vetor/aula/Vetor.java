package algoritmo.vetor.aula;

import java.util.Arrays;

public class Vetor {

	private String elementos[];
	private Integer tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public void addElementoVetor(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			this.tamanho++;
		} else {
          throw new Exception("O vetor estar cheior! Error " );
	 	}
	}
	
	public int getTamanhoVetor() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for(int index = 0 ; index < this.tamanho-1 ; index++ ) {
			builder.append(this.elementos[index]);
			builder.append(",");
		}
		if(tamanho >0) {
			builder.append(elementos[tamanho-1]);
		}
		builder.append("]");

		return builder.toString();
	}
	
	public String getValuePorIndexVetor(int posicaoBuscada) throws Exception {
		// buscar elemento no vetor pela posicao didgitada pelo usuario;
		// retorna valor caso existe e esteja na posicao correta
		// caso a posicao nao estiver no limite do array gerar um exeption de erro
		// caso contrario retorna o valor
		if(posicaoBuscada >= 0 && posicaoBuscada < tamanho  ) {
			return elementos[posicaoBuscada];
		}else {
			 throw new Exception("Erro valor da posição não existe");
		}
	}

	
	
	
	
}
