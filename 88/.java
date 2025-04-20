class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;

        // 用双指针分别指向两个数组,谁更小就放到sorted数组中 (直接通过移动数组1是及其复杂的,建立中间数组,空间复杂度O(N),时间复杂度o(M+N))
        while (p1 < m || p2 < n) { // 当两个指针都未结束
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }

        // 将结果复制到nums1中
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }
}
