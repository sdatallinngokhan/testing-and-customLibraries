package week10;

import week10.saturday.BasicCalculator;

public class Test {

    public int getResult() {
        BasicCalculator basicCalculator = new BasicCalculator();

        return basicCalculator.sumUpNumbers() + 5;
    }
}
