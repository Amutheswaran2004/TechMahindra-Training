package THREADS.Task_4;

class MatrixMultiplication implements Runnable {
    private final int[][] A, B, result;
    private final int row;

    public MatrixMultiplication(int[][] A, int[][] B, int[][] result, int row) {
        this.A = A;
        this.B = B;
        this.result = result;
        this.row = row;
    }

    @Override
    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            result[row][j] = 0;
            for (int k = 0; k < A[0].length; k++) {
                result[row][j] += A[row][k] * B[k][j];
            }
        }
    }
}

