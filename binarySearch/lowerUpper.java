public class lowerUpper {
    public static int lowerBound(int[] a, int x) {
        // first element found is greater than or equal to x
        int lo = 0;
        int hi = a.length - 1;
        int ans = a.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < x) {
                lo = mid + 1;
            } else {
                ans = mid;
                hi = mid - 1;
            }

        }
        return ans;
    }

    public static int upperBound(int[] a, int x) {
        // first element which is just less than x
        int lo = 0;
        int hi = a.length - 1;
        int ans = a.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < x) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 9, 10 };
        int key = 5;
        int index = lowerBound(arr, key);
        int uindex = upperBound(arr, key);
        if (index == arr.length) {
            System.out.println("Not found");
        } else {
            System.out.println("lower Bound: index:" + index + ", val: " + arr[index]);
        }
        if (uindex == arr.length) {
            System.out.println("Not found");
        } else {
            System.out.println("upper Bound: index:" + uindex + ", val: " + arr[uindex]);
        }
    }
}
