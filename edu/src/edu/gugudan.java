package edu;

public class gugudan {
	public static void printVertical() {
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("--------------");
		}
	}

	private static void printHorizontal() {
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + " * " + j + " = " + i * j);
				System.out.print("\t");
			}
			System.out.println("\t");
		}
	}

	private static void printColumn(int col) {
		// 인덱스 다루기 어려우니깐 위에서 다루고 시작
		for (int start = 2; start <= 9; start += col) {
			int end = Math.min(start + col - 1, 9); // 9를 초과하지 않도록 제한

			for (int j = 1; j <= 9; j++) {
				for (int i = start; i <= end; i++) {
					System.out.print(i + " * " + j + " = " + i * j);
					if (i < end)
						System.out.print("\t");
				}
				System.out.println("\n");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		// printVertical();
		// printHorizontal();
		printColumn(3);
	}
}