public class matrixAdd {
    public int[][] matrixAdd(int[][] A, int[][] B) {
        if (A.length == 0 && B.length == 0) {
            return new int[0][0];
        }
        else {
            int[][] C = new int[A.length][A[0].length];
            for(int r = 0; r < C.length; r++) {
                for(int c = 0; c < C[0].length; c++) {
                    C[r][c] = A[r][c] + B[r][c];
                }
            }
            return C;
        }
    }
}
