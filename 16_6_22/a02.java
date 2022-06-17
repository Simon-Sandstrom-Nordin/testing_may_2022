// doesn't work, something's very wrong with the long :(

public class a02 {

    public static void main(String []args) {

        int n = 10;
        double p = 1/6;

        int[] x = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = i;
        }

        long[] px = new long[n];

        for(int i = 0; i < n; i++) {
            px[i] = binomial(n, i, p);
            System.out.println(px[i]);
        }

    }


    private static long binomial(int n, int k, double p) {

        long combinations = factorial(n) / (factorial(k)*factorial(n-k));
        long probability = (long) (combinations * Math.pow(p, k) * Math.pow(1 - p, n-k));
        return probability;

    }

    private static int factorial(int n) {

        if (n==0) {     // base case
            return 1;
        }
        else {
            return n * factorial(n-1);
        }

    }

}
