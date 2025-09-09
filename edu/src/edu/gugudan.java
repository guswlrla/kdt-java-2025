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

//	private static void printColumn(int col) {
//		for (int j = 1; j <= 9; j++) {
//			for (int i = 2; i <= col + 1; i++) {
//				System.out.print(i + " * " + j + " = " + i * j);
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
//		for(int j = 1; j <= 9; j++) {
//			for (int i = col + 2; i <= 2 * col + 1 ; i++) {
//				System.out.print(i + " * " + j + " = " + i * j);
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
//		for(int j = 1; j <= 9; j++) {
//			for (int i = col+5; i <= 9  ; i++) {
//				System.out.print(i + " * " + j + " = " + i * j);
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
//		
//	}
	
	private static void printColumn(int col) {
		
	}

	public static void main(String[] args) {
		// printVertical();
		// printHorizontal();
		printColumn(5);
	}
}