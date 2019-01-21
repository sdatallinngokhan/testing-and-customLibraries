package week10.sunday;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberCalculatorTest {

    PrimeNumberCalculator primeNumberCalculator;

    @Before
    public void setUp() {
        primeNumberCalculator = new PrimeNumberCalculator();
    }

    @Test
    public void shouldCalculateAnIntegerNumberIsPrimeOrNot() {
        // given
        int num1 = 3;
        int num2 = 11;
        int num3 = 59;
        int num4 = 26;

        // when
        boolean actualResult1 = primeNumberCalculator.isPrime(num1);
        boolean actualResult2 = primeNumberCalculator.isPrime(num2);
        boolean actualResult3 = primeNumberCalculator.isPrime(num3);
        boolean actualResult4 = primeNumberCalculator.isPrime(num4);

        // then
        Assert.assertTrue(actualResult1);
        Assert.assertTrue(actualResult2);
        Assert.assertTrue(actualResult3);
        Assert.assertFalse(actualResult4);
    }

}