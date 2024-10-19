import java.util.*;

public class WeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int[][] soldiersInRows = new int[mat.length][2];
        
        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) soldiers++;
            }
            soldiersInRows[i][0] = soldiers;
            soldiersInRows[i][1] = i;
        }

        Arrays.sort(soldiersInRows, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        for (int i = 0; i < k; i++) {
            result[i] = soldiersInRows[i][1];
        }

        return result;
    }

    public static void main(String[] args) {
        WeakestRows wr = new WeakestRows();
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        System.out.println(Arrays.toString(wr.kWeakestRows(mat, 3)));  // Output: [2, 0, 3]
    }
}
