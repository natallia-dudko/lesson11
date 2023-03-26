package by.lesson.eleven.main;

import java.util.Random;

/*
 * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task09 {

	public static void main(String[] args) {
		int n = 5;
		int[][] mas = new int[n][n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("--------");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]", mas[i][i]);
		}
		System.out.println();
		for (int j = 0; j < mas[mas.length - 1].length; j++) {
			System.out.printf("[%4d]", mas[mas.length - 1 - j][j]);
		}
	}
}
