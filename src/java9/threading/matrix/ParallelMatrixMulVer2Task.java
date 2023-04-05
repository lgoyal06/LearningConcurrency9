package java9.threading.matrix;

import static java.lang.Thread.sleep;

//Thread per record
public class ParallelMatrixMulVer2Task implements Runnable {
    double[][] matA;
    double[][] matB;
    double[][] result;
    int i;
    int j;

    public ParallelMatrixMulVer2Task(double[][] matA, double[][] matB, double[][] result, int i) {
        this.matA = matA;
        this.matB = matB;
        this.result = result;
        this.i = i;
    }

    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int j = 0; j < matB[0].length; ++j) {
            for (int k = 0; k < matA[0].length; ++k) {
                result[i][j] = result[i][j] + (matA[i][k] * matB[k][j]);
            }
        }
    }
}
