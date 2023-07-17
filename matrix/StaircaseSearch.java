public class StaircaseSearch {

    // top and right
    public static void topRightSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length - 1 && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at : " + "(" + row + ", " + col + " )");
                return;
            } else if (matrix[row][col] > key)
                col--;
            else
                row++;
        }
        System.out.println("Key not found!");

    }

    // bottom and left
    public static void bottomLeftSearch(int matrix[][], int key) {
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at : " + "(" + row + ", " + col + " )");
                return;
            } else if (matrix[row][col] < key)
                col++;
            else
                row--;
        }
        System.out.println("Key not found!");
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        bottomLeftSearch(matrix, 33);
    }
}
