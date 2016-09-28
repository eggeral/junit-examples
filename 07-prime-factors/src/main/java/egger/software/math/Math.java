package egger.software.math;

public class Math {

    public static String primeFactors(long number) {
        boolean first = true;
        String result = "";

        if (number <= 1) {
            return "This value is not valid!";
        }

        for (long idx = 2; idx <= number; idx++) {
            long count = 0;
            while (number % idx == 0) {
                count++;
                number /= idx;
            }
            if (count > 0) {
                if (!first)
                    result += " * ";
                else
                    first = false;

                if (count == 1)
                    result += ("" + idx);
                else
                    result += (idx + "^" + count);

                count = 0;
            }
        }

        return result;
    }
}
