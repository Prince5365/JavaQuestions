public class RowSumInMatrix {
    public static int[] rowSums(int[][] mat) {
        int n = mat.length; 
        int[] result = new int[n];
       
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int[] rowSums = rowSums(mat);

        System.out.print("Row sums: ");
        for (int sum : rowSums) {
            System.out.print(sum + " ");
        }
    }
}
