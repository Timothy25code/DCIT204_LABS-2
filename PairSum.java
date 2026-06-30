import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < n && !found; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\n--- Pair Found ---");
                    System.out.println("Index " + i + " (value " + arr[i] + ") + Index " + j + " (value " + arr[j] + ") = " + target);
                    System.out.println("Equation: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("\nNo pair found that sums to " + target + ".");
        }

        scanner.close();
    }
}
