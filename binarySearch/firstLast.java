public class firstLast {
    private static int firstOccurence(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        int first = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                if (first == -1) {
                    first = mid;
                } else if (mid < first) {
                    first = mid;
                }
                hi = mid - 1;
            }

        }
        if (first == -1) {
            return -1;
        } else
            return first;
        // return lo;

    }

    private static int lastOccurence(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        int last = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                if (last == -1) {
                    last = mid;
                } else if (mid > last) {
                    last = mid;
                }
                lo = mid + 1;
            }

        }
        if (last == -1) {
            return -1;
        } else
            return last;
        // return lo - 1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8 };
        int key = 4;
        int findex = firstOccurence(arr, key);
        int lindex = lastOccurence(arr, key);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("first index at : " + findex + "\n last index at : " + lindex);
        // first index at : 4
        // last index at : 10
    }
}
