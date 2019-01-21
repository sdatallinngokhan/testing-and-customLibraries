package week10.sunday;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDCalculatorTest {

    GCDCalculator gcdCalculator;

    @Before
    public void setUp() {
        gcdCalculator = new GCDCalculator();
    }

    @Test
    public void shouldReturnCorrectGCDOfAnArray() {
        // given
        int[] numbersArray = {10, 30, 25};
        int expectedResult = 5;

        // when
        int actualResult = gcdCalculator.getGCD(numbersArray);

        // then
        assertEquals(expectedResult, actualResult);
    }

}