package week10.saturday;

import org.junit.Test;
import week10.saturday.BasicCalculator;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest {

    @Test
    public void shouldReturnCorrectResultWhenSumUpTwoNumbers(){
        // given
        BasicCalculator basicCalculator = new BasicCalculator();
        int expectedResult = 5;

        // when
        int actualResult = basicCalculator.sumUpNumbers();

        // then
        assertEquals(5, 3, 2);
    }

}