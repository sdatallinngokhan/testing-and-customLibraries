package week10.sunday;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class MockitoExerciseTest {

    @Test
    public void shouldSumUp() {
        // given
        MockitoExercise mockitoExercise = Mockito.mock(MockitoExercise.class);
        Mockito.when(mockitoExercise.sumUp()).thenReturn(8);

        // when
        int actualResult = mockitoExercise.sumUp();

        //then
        assertEquals(8, actualResult);
    }

    @Test
    public void shouldReadRss(){
        // given
        MockitoExercise mockitoExercise = Mockito.mock(MockitoExercise.class);
        Mockito.when(mockitoExercise.readRss("An invalid URL")).thenReturn("TITLE1");

        // when
        String actualResult = mockitoExercise.readRss("An invalid URL");

        // then
        assertEquals("TITLE1", actualResult);
    }
}