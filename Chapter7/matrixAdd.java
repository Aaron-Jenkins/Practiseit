public class matrixAdd {
    /* Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters,
    treats the arrays as 2D matrices and adds them, returning the result. The sum of two matrices A and B is a
    matrix C where for every row i and column j, Cij = Aij + Bij. You may assume that the arrays passed as parameters
    have the same dimensions.
     */

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
