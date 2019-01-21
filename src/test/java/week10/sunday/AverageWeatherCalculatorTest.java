package week10.sunday;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AverageWeatherCalculatorTest {

    @Test
    public void shouldCalculateAverage(){
        // given
        AverageWeatherCalculator averageWeatherCalculator = Mockito.spy(AverageWeatherCalculator.class);
        List<Integer> weatherList = Arrays.asList(1,2,3);
        Mockito.doReturn(weatherList).when(averageWeatherCalculator).readFileAndGetContent(Mockito.anyString());

        // when
        int actualResult = averageWeatherCalculator.getAverageWeather("some path");

        //then
        assertEquals(2, actualResult);
    }

}