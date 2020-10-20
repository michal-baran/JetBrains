import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger number = new BigInteger(Integer.toString(n));

        for (int i = n - 2; i > 0; i -= 2) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        return number;
    }
}