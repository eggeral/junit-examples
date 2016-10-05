package egger.software.junit;

public class Math {

//    public static long fibonacci(long n) {
//        if (n <= 0)
//            throw new IllegalArgumentException("n has to be > 0 but was: " + n);
//        if (n == 1)
//            return 1;
//        if (n == 2)
//            return 1;
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }

    public static long fibonacci(long n) {
        if (n <= 0)
            throw new IllegalArgumentException("n has to be > 0 but was: " + n);
        if (n >= 93) // In Java 8 use Math.addExact
            throw new ArithmeticException("n has to be <= 93 to avoid long overflow but was: " + n);
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;

        long previous = 1;
        long current = 2;
        for (long idx = 3; idx < n; idx++) {
            long tmp = current;
            current = previous + current;
            previous = tmp;
        }
        return current;
    }
}
