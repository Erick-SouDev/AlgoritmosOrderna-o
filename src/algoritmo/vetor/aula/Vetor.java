package algoritmo.vetor.aula;

public class Vetor {

	private String elementos[];
	private Integer tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public void addVectorElement(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("O vetor estar cheior... ");
		}
	}

	public int getSizeVector() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int index = 0; index < this.tamanho - 1; index++) {
			builder.append(this.elementos[index]);
			builder.append(",");
		}
		if (tamanho > 0) {
			builder.append(elementos[tamanho - 1]);
		}
		builder.append("]");

		return builder.toString();
	}

	public String getValueByIndexVector(int posicaoBuscada) throws Exception {
		if (posicaoBuscada >= 0 && posicaoBuscada < tamanho) {
			return elementos[posicaoBuscada];
		} else {
			throw new IllegalArgumentException("Erro! Posição Invalida");
		}
	}

	public int searchPositionElementVector(String value) throws Exception {
		for (int pos = 0; pos < elementos.length; pos++) {
			if (elementos[pos] == value) {
				return pos;
			}
		}

		return -1;

	}

	public Boolean checkElementExists(String value) {
		Boolean existe = false;
		for (int pos = 0; pos < elementos.length; pos++) {
			if (elementos[pos] == value) {
				existe = true;
				break;
			} else {
				existe = false;

			}
		}

		if (existe) {
			return true;
		}
		return existe;

	}

}
