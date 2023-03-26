package by.lesson.eleven.main;

/*
 * 16.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task16 {

	public static void main(String[] args) {
		int n = 10;
		int[][] mas = new int[n][n];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i][i] =(i+1)*(i+2);
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();

	}

}
