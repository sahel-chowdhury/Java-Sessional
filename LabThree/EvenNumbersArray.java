import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        int[] evens = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evens[index] = i;
                index++;
            }
        }

      System.out.println("Even numbers in the range:");
        for (int i = 0; i < evens.length; i++) {
            System.out.print(evens[i] + " ");
        }
        sc.close();
    }
}

