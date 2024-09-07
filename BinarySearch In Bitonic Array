public class BitonicBinarySearch {

    // Function to find the peak of the bitonic array
    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the peak
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // Peak index
    }

    // Binary search in the increasing part of the bitonic array
    public static int binarySearchIncreasing(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Binary search in the decreasing part of the bitonic array
    public static int binarySearchDecreasing(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Function to perform binary search in a bitonic array
    public static int bitonicBinarySearch(int[] arr, int target) {
        int peak = findPeak(arr);

        // Try to find the target in the increasing part
        int index = binarySearchIncreasing(arr, target, 0, peak);
        if (index != -1) {
            return index;
        }

        // Try to find the target in the decreasing part
        return binarySearchDecreasing(arr, target, peak + 1, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2}; // Example bitonic array
        int target = 4; // Target to find

        int result = bitonicBinarySearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
