package week10.sunday;

public class PrimeNumberCalculator {

    public boolean isPrime(int primeOrNotPrime) {

        int counter = 0;
        for (int i = 1; i <= primeOrNotPrime; i++) {
            if (primeOrNotPrime % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            return true;
        }

        return false;
    }
}
