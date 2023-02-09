package dip.leetcode.solutions;

class VersionControl {
    boolean isBadVersion(int n) {
        return n == 4;
    }
}

public class Solution278 extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}