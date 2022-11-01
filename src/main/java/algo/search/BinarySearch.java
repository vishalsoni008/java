package algo.search;

public class BinarySearch {

    static int search(int[] arr, int left, int right, int n) {
        while (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == n)
                return mid;

            if (arr[mid] > n)
                return search(arr, 0, mid - 1, n);

            if (arr[mid] < n)
                return search(arr, mid + 1, right, n);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 22, 33, 45, 66, 78, 99};

        int s = search(arr, 0, arr.length - 1, 33);

        if (s == -1)
            System.out.println("element is not present there");
        else
            System.out.println("element is present in " + s);
    }
}
