package week10.sunday;

public class GCDCalculator {

    public int getGCD(int[] numbersArray) {

        int gcd = 1;

        for (int i = 1; i <= numbersArray[0]; i++) {
            boolean isCommon = false;
            for (int j = 0; j < numbersArray.length; j++) {
                if (numbersArray[j] % i == 0) {
                    isCommon = true;
                }else {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon == true){
                gcd = i;
            }
        }

        return gcd;
    }
}
