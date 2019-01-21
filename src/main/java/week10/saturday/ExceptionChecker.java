package week10.saturday;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionChecker {

    public int getArrayElement(int[] array, int index) {
        return array[index];
    }

    public void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
    }
}
