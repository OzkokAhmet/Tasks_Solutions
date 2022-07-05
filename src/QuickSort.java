import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);

        }

        System.out.println("Before");
        long stTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(numbers));

        //regularSort(numbers);
          quicksort(numbers, 0, numbers.length-1);

        System.out.println("After");
        System.out.println(Arrays.toString(numbers));
        long endTime = System.currentTimeMillis();
        System.out.println("Total time " + (endTime - stTime) / 1000);
    }

    private static void regularSort(int[] numbers) {

        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }


    private static void quicksort(int[] numbers, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;

        int pivot = numbers[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(numbers, leftPointer, rightPointer);
        }
        swap(numbers, leftPointer, highIndex);
        quicksort(numbers, lowIndex, leftPointer - 1);
        quicksort(numbers, leftPointer+1, highIndex);
    }

    public static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

    }

}
