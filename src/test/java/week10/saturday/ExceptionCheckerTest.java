package week10.saturday;

import org.junit.Test;
import week10.saturday.ExceptionChecker;

import java.io.FileNotFoundException;

public class ExceptionCheckerTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenIndexIsBiggerThanArrayIndex() {
        // given
        ExceptionChecker exceptionChecker = new ExceptionChecker();
        int[] nums = {4, 7, 11, 20};
        int index = 4;

        // when
        exceptionChecker.getArrayElement(nums, index);

        // then
    }

    @Test(expected = FileNotFoundException.class)
    public void shouldThrowFileNotFoundExceptionWhenFileDoesNotExist() throws FileNotFoundException {
        // given
        ExceptionChecker exceptionChecker = new ExceptionChecker();
        String path = "/User/gokhan/nonexistfile.txt";

        // when
        exceptionChecker.readFile(path);
    }

}