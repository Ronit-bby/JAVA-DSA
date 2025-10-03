package DAY44;

public class Fiboncchi {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int terms = 6;
        System.out.println("Fibonacci of " + terms + " = " + fib(terms));
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
