public class MatrixAddition {
    public static void main(String[] args) {
        int[][] mat1 = { {1, 2}, {5, 3} };
        int[][] mat2 = { {2, 3}, {4, 1} };
        int[][] sum = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Matrix Sum:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
