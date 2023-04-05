package java9.threading.matrix;

import java.util.ArrayList;
import java.util.List;

//Thread per record
public class ParallelMatMulVer1 {

    public static void main(String... s) throws InterruptedException {
        double[][] matA = {{1, 2}, {3, 4}, {5, 6}};
        double[][] matB = {{1, 2, 3}, {4, 5, 6}};
        double[][] resultantMat = new double[matA.length][matB[0].length];
        List<Thread> ths = new ArrayList<>();
        for (int i = 0; i < matA.length; ++i) {
            for (int j = 0; j < matB[0].length; ++j) {
                Thread th = new Thread(new ParallelMatrixMulVer1Task(matA, matB, resultantMat, i, j));
                th.start();
                ths.add(th);
            }
        }

        /**
         Join is a synchronization method that blocks the calling thread
         (that is, the thread that calls the method) until the thread whose
         Join method is called has completed.
         **/
        for (Thread th : ths) {
            th.join();
        }

        for (int i = 0; i < matA.length; ++i) {
            for (int j = 0; j < matB[0].length; ++j) {
                System.out.println(resultantMat[i][j]);
            }
        }
    }
}
