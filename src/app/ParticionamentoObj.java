package app;

public class ParticionamentoObj {
	private int[] valores;
	private int left;
	private int right;
	private int pivot;
	private int i;

	public ParticionamentoObj(int[] valores, int left, int right) {
		this.valores = valores;
		this.left = left;
		this.right = right;
	}

	public int executar() {
		inicializarPivot();
		particionarArray();
		posicionarPivot();
		return i;
	}

	public void inicializarPivot() {
		pivot = valores[left];
		i = left;
	}

	private void particionarArray() {
		for (int j = i + 1; j <= right; j++) {
			if (valores[j] <= pivot) {
				i++;
				swap(i, j);
			}
		}
	}

	private void posicionarPivot() {
		swap(left, i);
	}

	private void swap(int i, int j) {
		int temp = valores[i];
		valores[i] = valores[j];
		valores[j] = temp;
	}

}