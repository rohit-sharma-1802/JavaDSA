public class SpiralMatrix {
    public static void spiralTraversal(int matrix[][]) {
        int startRow = 0, startColumn = 0, endRow = matrix.length - 1, endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            // top
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }

            // bottom
            for (int i = endColumn - 1; i >= startColumn; i--) {
                if (startRow == endRow)
                    break;
                System.out.print(matrix[endRow][i] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn)
                    break;
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        spiralTraversal(matrix);
    }
}
