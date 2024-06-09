package Numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Primes in given range are ");
        printPrimes(100);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 3; i <= number / 2; i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void printPrimes(int range) {
        int number_or_primes = 0;
        if (range <= 1) {
            System.out.println("No primes in given range");
        } else if (range == 2) {
            number_or_primes += 1;
            System.out.println("2");
        } else {
            number_or_primes += 1;
            System.out.println(2);
            for(int i = 3; i <= range; i+=2) {
                if(isPrime(i)) {
                    number_or_primes += 1;
                    System.out.println(i);
                }
            }
        }
        System.out.println("Count is "+number_or_primes);
    }
}
