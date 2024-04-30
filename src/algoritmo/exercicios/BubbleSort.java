package algoritmo.exercicios;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = new int[] { 6, 3, 8, 2, 5, 10, 9, 4 };
		int auxiliar;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					auxiliar = array[j + 1];
					array[j + 1] = array[j];
					array[j] = auxiliar;
				}
			}
		}
		System.out.println("------------------Ordenado--------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
