package app;

public class ParticionamentoObj {
	private QuickSort origem;
	private int left;
	private int right;

	private int pivot;
	private int i;

	public ParticionamentoObj(QuickSort origem, int left, int right) {
		this.origem = origem;
		this.left = left;
		this.right = right;
	}

	public int computar() {
		inicializarPivot();
		particionarArray();
		posicionarPivot();
		return i;
	}

	private void inicializarPivot() {
		pivot = origem.getValores()[left];
		i = left;
	}

	private void particionarArray() {
		for (int j = i + 1; j <= right; j++) {
			if (origem.getValores()[j] <= pivot) {
				i++;
				origem.swap(i, j);
			}
		}
	}

	private void posicionarPivot() {
		origem.swap(left, i);
	}
}