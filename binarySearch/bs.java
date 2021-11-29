import java.util.*;
// import java.io.*;

class Main {
    public static int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // clear the input buffer
        sc.nextLine();
        int x = sc.nextInt();
        int index = binarySearch(arr, x);
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + index);
        sc.close();
    }
}