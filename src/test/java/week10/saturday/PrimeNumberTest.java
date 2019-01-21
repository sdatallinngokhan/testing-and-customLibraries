package week10.saturday;

import org.junit.Test;
import week10.saturday.PrimeNumber;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void shouldReturnNthPrime(){
        // given
        PrimeNumber primeNumber = new PrimeNumber();
        int n = 7;
        int expectedPrime = 17;

        // when
        int actualPrime = primeNumber.getNthPrime(n);

        // then
        assertEquals(expectedPrime, actualPrime);
    }

}