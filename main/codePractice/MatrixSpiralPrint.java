package codePractice;

public class MatrixSpiralPrint {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };

		/// 123456789
		int rowLength = matrix.length;
		int columnLength = matrix.length;
		int r = 0;
		int c = 0;

		while (r < rowLength && c < columnLength) {
			// Print the first row from the remaining rows
			for (int i = c; i < columnLength; i++) {
				System.out.print(matrix[r][i]);
			}
			r++;

			// Print the last column from the remaining columns
			for (int j = r; j < rowLength; j++) {
				System.out.print(matrix[j][columnLength - 1]);
			}
			columnLength--;

			// Print the last row from the remaining rows */
			if (r < rowLength) {
				for (int i = columnLength - 1; i >= c; i--) {
					System.out.print(matrix[rowLength - 1][i]);
				}
				rowLength--;
			}

			// Print the first column from the remaining columns
			if (c < columnLength) {
				for (int i = rowLength - 1; i >= r; i--) {
					System.out.print(matrix[i][c]);
				}
				c++;
			}

		}
	}

}
