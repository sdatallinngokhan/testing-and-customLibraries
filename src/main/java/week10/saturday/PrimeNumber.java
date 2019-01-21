package week10.saturday;

public class PrimeNumber {

    public int getNthPrime(int n) {

        int primeCounter = 0;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            int dividibleNumbersCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dividibleNumbersCount++;
                }
            }

            if (dividibleNumbersCount == 2) {
                primeCounter++;

                if (primeCounter == n) {
                    return i;
                }
            }
        }

        return 0;
    }

}
