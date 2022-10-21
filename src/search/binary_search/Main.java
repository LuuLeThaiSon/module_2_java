package search.binary_search;

public class Main {
    public static void main(String[] args) {
        int[] array;

        array = new int[]{1,2,3,4,5,6,7,8,9,10};

        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.binarySearch(array, 3));
    }
}
