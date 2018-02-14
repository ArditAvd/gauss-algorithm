import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Gauss Algorithm");

            GaussAlgorithm gaussAlgorithm = new GaussAlgorithm();

            System.out.println("\nType number of variables");
            int N = scan.nextInt();

            double[] B = new double[N];
            double[][] A = new double[N][N];

            System.out.println("\nType "+ N +" equations ");
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    A[i][j] = scan.nextDouble();

            System.out.println("\nType "+ N +" values");
            for (int i = 0; i < N; i++)
                B[i] = scan.nextDouble();

            gaussAlgorithm.solveSystem(A,B);
        }
}
