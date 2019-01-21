package week10.saturday;

public class BasicCalculator {

    public int sumUpNumbers() {
        int result = 2 + 3;
        return result;
    }

    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();

        int result = basicCalculator.sumUpNumbers();

        System.out.println(result);
    }
}
