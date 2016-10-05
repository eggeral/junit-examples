package egger.software.junit;

public class Math {

    public static long fibonacci(long n) {
        if (n <= 0)
            throw new IllegalArgumentException("n has to be > 0 but was: " + n);
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
