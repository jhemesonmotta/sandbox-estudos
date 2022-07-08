public class Turing {
    public static void main(String[] args) {
        int [][] matriz = new int[3][2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 5;

        System.out.println(maxUniqueInMatrix(matriz));
    }

    public static int maxUniqueInMatrix(int[][] matrix) {
        int maximum = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maximum) {
                    maximum = matrix[i][j];
                }
            }
        }

        if (maximum == -1) {
            return maximum;
        }

        int countMax = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == maximum) {
                    countMax = countMax + 1;
                    matrix[i][j] = -1;
                }
            }
        }

        if (countMax > 1) {
            maximum = maxUniqueInMatrix(matrix);
        }

        return maximum;
    }
}
