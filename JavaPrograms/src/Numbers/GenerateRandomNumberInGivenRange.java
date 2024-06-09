package Numbers;

import java.util.Random;

public class GenerateRandomNumberInGivenRange {
    public static void main(String[] args) {
        int min = 100;
        int max = 200;
        Random random = new Random();
        int random_number = random.nextInt(max - min) + min;
        System.out.println("Random number generated between range "+min+" and "+max+" is :: "+random_number);
    }
}
