public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1, 4, 7, 6};
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));

        sortArray(numbers);
        System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));
    }
    public static void sortArray(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

               for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}







