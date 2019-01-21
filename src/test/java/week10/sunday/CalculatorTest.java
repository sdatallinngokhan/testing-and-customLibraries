package week10.sunday;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before test method");
    }

    @Test
    @Ignore // TODO: ignore will be deleted after refactoring
    public void shouldSumUpTwoNumbers() {
        // given
        int num1 = 3;
        int num2 = 4;
        int expectedResult = 7;

        // when
        int actualResult = calculator.sumUpTwoNumbers(num1, num2);

        // then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        // given
        int num1 = 8;
        int num2 = 2;
        int expectedResult = 6;

        // when
        int actualResult = calculator.subtractTwoNumbers(num1, num2);

        // then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        // given
        int num1 = 4;
        int num2 = 6;
        int expectedResult = 24;

        // when
        int actualResult = calculator.multiplyTwoNumbers(num1, num2);

        // then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        // given
        int num1 = 80;
        int num2 = 40;
        int expectedResult = 2;

        // when
        int actualResult = calculator.divideTwoNumbers(num1, num2);

        // then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldModTwoNumbers() {
        // given
        int num1 = 9;
        int num2 = 4;
        int expectedResult = 1;

        // when
        int actualResult = calculator.modTwoNumbers(num1, num2);

        // then
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void finishTestClass(){
        System.out.println("After test method");
    }
}