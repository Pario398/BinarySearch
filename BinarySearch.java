import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a list of numbers: ");
            String[] input = scanner.nextLine().split(",");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++)
                arr[i] = Integer.parseInt(input[i]);

            System.out.print("Enter the number you want to search for: ");
            int key = scanner.nextInt();

            int result = binarySearch(arr, key);
            if (result == -1)
                System.out.println("Element not found");
            else
                System.out.println("Element found at index " + result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
