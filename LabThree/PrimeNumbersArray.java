import java.util.Scanner;

public class PrimeNumbersArray {
    
    // Method to check prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        int[] primes = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes[index] = i;
                index++;
            }
        }


        System.out.println("Prime numbers in the range:");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }

        sc.close();
    }
}

