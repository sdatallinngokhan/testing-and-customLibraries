package week10.sunday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AverageWeatherCalculator {

    public int getAverageWeather(String path) {
        List<Integer> weatherList = readFileAndGetContent(path);
        int averageWeather = calculateAverage(weatherList);
        return averageWeather;
    }

    public List<Integer> readFileAndGetContent(String path) {
        List<Integer> weatherList = new ArrayList<Integer>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                weatherList.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return weatherList;
    }

    public int calculateAverage(List<Integer> weatherList){
        int lineCounter = 0;
        int totalWeatherValue = 0;

        for (Integer weather : weatherList){
            totalWeatherValue += weather;
//            totalWeatherValue = totalWeatherValue + weather; same as above
            lineCounter++;
        }

        return  totalWeatherValue / lineCounter;
    }

    public static void main(String[] args) {
        AverageWeatherCalculator averageWeatherCalculator = new AverageWeatherCalculator();
        String path = "/Users/gokhanpolat/Developer/tallinn/weathers.txt";
        int result = averageWeatherCalculator.getAverageWeather(path);
        System.out.println(result);
    }
}
