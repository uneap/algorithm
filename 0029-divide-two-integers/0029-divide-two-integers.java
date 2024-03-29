import java.math.*;

class Solution {
    public int divide(int dividend, int divisor) {
        BigInteger dividendBig = new BigInteger(Integer.toString(dividend));
        BigInteger divisorBig = new BigInteger(Integer.toString(divisor));
        BigInteger result = dividendBig.divide(divisorBig);
        if(result.compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE))) > 0) {
            return Integer.MAX_VALUE;
        }
        if(result.compareTo(new BigInteger(Integer.toString(Integer.MIN_VALUE))) < 0) {
            return Integer.MIN_VALUE;
        }
        return result.intValue();
    }
}