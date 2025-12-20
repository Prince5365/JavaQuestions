import java.util.ArrayList;
public class PrintMatrixInSnakePattern {
    public static ArrayList<Integer> snakePattern(int[][] matrix, int N) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    result.add(matrix[i][j]);
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int N = 3;
        int[][] matrix = {
            {45, 48, 54},
            {21, 89, 87},
            {70, 78, 15}
        };
        ArrayList<Integer> output = snakePattern(matrix, N);
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
    
}
