public class HelperClass {


    public void printRowEchelonForm(double[][] A, double[] B) {
        int N = B.length;
        System.out.println("\nEchelon Matric Form : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%.3f ", A[i][j]);
            System.out.printf("| %.3f\n", B[i]);
        }
        System.out.println();
    }

    public void printRezults(double[] solutions) {
        int N = solutions.length;
        System.out.println("\nSolutions : ");
        for (int i = 0; i < N; i++)
            System.out.printf("%.3f ", solutions[i]);
        System.out.println();
    }

}
