// import java.util.*;

public class sqrt {
    public static int getsqrt(int n) {
        int lo = 1;
        int hi = n;
        int ans = 1;
        // binary search to get integer sqrt of n
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid * mid <= n) {
                // getting the biggest square which is smaller than or equal to n
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int intSqrt = getsqrt(n);
        System.out.println("integer : " + n + "\nsqrt(integer part only): " + intSqrt);
    }
}
