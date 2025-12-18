import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        // Step 1: Count even numbers
        int count = 0;
        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        }

        // Step 2: Create array
        int[] evenArray = new int[count];

        // Step 3: Store even numbers in array (using while)
        i = start;
        int index = 0;
        while (i <= end) {
            if (i % 2 == 0) {
                evenArray[index] = i;
                index++;
            }
            i++;
        }

        // Step 4: Print even numbers using do-while loop
        System.out.println("\nEven numbers are:");
        int j = 0;
        if (evenArray.length > 0) {
            do {
                System.out.print(evenArray[j] + " ");
                j++;
            } while (j < evenArray.length);
        } else {
            System.out.println("No even numbers found.");
        }
    }
}
