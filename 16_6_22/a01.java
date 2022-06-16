public class a01 {

    public static void main(String []args) {

        double a = .1;
        double b = .2;
        double a_b = .05;

        System.out.println(pie(a, b, a_b));

        int black = 4;
        int white = 3;

        System.out.println("with");
        System.out.println(with(black, white));

        System.out.println("sin");
        System.out.println(sin(black, white));


    }

    private static double pie(double a, double b, double a_b) {

        double answer = a + b - a_b;
        return answer;

    }

    private static double with(int b, int w) {
        int comb = factorial(2) / (factorial(1)*factorial(1));
        double ans = comb * w * b / Math.pow((w + b), 2);
        return ans;

    }

    private static double sin(int b, int w) {
        double white_comb = factorial(w) / (factorial(1)*factorial(w - 1));
        double black_comb = factorial(b) / (factorial(1)*factorial(b - 1));
        double total_comb = factorial(w+b) /(factorial(2)*factorial(w+b-2));

        double ans = white_comb*black_comb/total_comb;
        return ans;

    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

}
