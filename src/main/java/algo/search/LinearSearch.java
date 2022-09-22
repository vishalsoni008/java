package algo.search;

public class LinearSearch {

    static int search(int arr[], int n){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] =new int[]{2,1,4,23,5,4};

        int s= search(arr, 238);

        if (s == -1)
            System.out.println("element is not present");

        else
            System.out.println("element is present in index of "+s);
    }
}
