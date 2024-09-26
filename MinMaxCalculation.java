public class MinMaxCalculation {
    
    public static int[] findMinMax(int[] numbers) {
        // Initialize min and max to the first number
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the numbers to find min and max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Return both min and max as an array
        return new int[] {min, max};
    }
}