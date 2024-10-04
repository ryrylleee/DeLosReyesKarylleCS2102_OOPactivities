import java.util.Scanner;

public class GetArrayMean {
    public static double getArrayMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        double mean = getArrayMean(numbers);
        System.out.printf("Mean of array is: %.2f", mean);
    scanner.close();
    }
}
