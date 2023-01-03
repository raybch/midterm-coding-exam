package src.math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int maxN = 40;
        int pN = 0;
        int nN = 1;

        System.out.print("Fibonacci Series of "+maxN+" numbers:");

        for (int i = 1; i <= maxN; ++i)
        {
            System.out.print(pN+" ");
            int sum = pN + nN;
            pN = nN;
            nN = sum;
        }
    }
}
