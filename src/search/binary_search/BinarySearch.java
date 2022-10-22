package search.binary_search;

public class BinarySearch {
    public int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = ((low + high) / 2);

            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key == arr[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
