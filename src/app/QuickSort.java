package app;

public class QuickSort {

	private int[] valores;

	private QuickSort(int[] valores) {
		this.valores = valores;
	}

	public static QuickSort getInstancia(int[] valores) {
		return new QuickSort(valores);
	}

	public int getSize() {
		return valores.length;
	}

	public int particionamento(int left, int right) {
		ParticionamentoObj p = new ParticionamentoObj(valores, left, right);
		return p.executar();
	}

	public int[] ordenar(int left, int right) {
		if (left < right) {
			int indicePivot = particionamento(left, right);
			ordenar(left, indicePivot -1);
			ordenar(indicePivot + 1, right);
		}
		return valores;
	}
}