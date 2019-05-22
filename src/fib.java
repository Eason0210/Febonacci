public class fib {
    public static void main(String[] args) {

        System.out.println(fib(3));
    }


    public static int  fib(int n ) {

        int fibResult =0;
            if (n == 0 || n == 1) {

                return 1;

            } else

                fibResult += fib(n - 1) + fib(n - 2);

        return fibResult;
    }
}
