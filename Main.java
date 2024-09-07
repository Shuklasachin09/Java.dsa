class Main {
    public static void main(String[] args) {
        int arr[] = {11, 23, 36, 49, 54, 31, 10};
        int target = 10;
        int high = peak(arr);
        System.out.println("The peak is index - " + high);
        if (target > arr[high]) {
            int ans1 = bsright(arr, target, high);
            System.out.println("Element found at index - " + ans1);
        } else {
            int ans2 = bsleft(arr, target, high);
            System.out.println("Element found at index - " + ans2);
        }
    }

    public static int peak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int bsleft(int arr[], int target, int high) {
        int start = 0;
        int end = high;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }


    public static int bsright(int arr[], int target, int high) {
        int start = high;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
