package Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int key = 88;
        boolean ans = search(matrix,key);
    }

    public static boolean search(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at "+ "("+row+","+col+")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else if (key > matrix[row][col]) {
                row++;
            }
        }
        System.out.println("key not found.");
        return false;
    }
}

