class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 先来个简单的情况: 如果任意一个数组为空
        if(m==0){
            // 将nums2的数据直接放到nums1中
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        if(n==0){
            return;
        }

        // 双指针解决
        int idx_1 = 0;
        int idx_2 = 0;
        int count = 0;
        // System.out.println("123");
        for(int i=0;i<m+n;i++){
            // 左边指针所指数据较大
            if(nums1[idx_1] > nums2[idx_2]){
                // 不做处理
            }else{
                // nums1数组从这个索引开始的数据右移一位
                
            }
        }
    }
}