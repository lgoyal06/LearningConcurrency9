package java9.threading.matrix;

import static java.lang.Thread.sleep;

//Thread per record
public class ParallelMatrixMulVer1Task implements Runnable {
    double[][] matA;
    double[][] matB;
    double[][] result;
    int i;
    int j;

    public ParallelMatrixMulVer1Task(double[][] matA, double[][] matB, double[][] result, int i, int j) {
        this.matA = matA;
        this.matB = matB;
        this.result = result;
        this.i = i;
        this.j = j;
    }


    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int k = 0; k < matA[0].length; ++k) {
            result[i][j] = result[i][j] + (matA[i][k] * matB[k][j]);
        }
    }
}
