package week10;

import org.junit.Test;
import org.mockito.Mockito;
import week10.saturday.BasicCalculator;

public class TestTest {

    BasicCalculator basicCalculator;

    @Test
    public void ddd(){
        basicCalculator = Mockito.mock(BasicCalculator.class);
        Mockito.when(basicCalculator.sumUpNumbers()).thenReturn(6);

        week10.Test test = new week10.Test();

        int a = test.getResult();
        System.out.println();
    }

}