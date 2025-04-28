class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * 双指针法
         * 1.一个指针指向 num1,一个指向num2 两个指针从左往右遍历
         * 2.比较指针a,b 找出较小较小者加入到sorted数组中
         * 3.将sorted数组中的数据保存到num1中
         */
        int p=0,q=0;
        int[] tmp  = new int[nums1.length];
        int cur;

        // 将数组的值赋值给tmp
        while(p < m || q < n){
            if(p==m){
                cur= nums2[q++];
            }else if(q == n){
                cur= nums1[p++];
            }else if(nums1[p] < nums2[q]){
                cur= nums1[p++];
            }else{
                cur= nums2[q++];
            }
            tmp[p+q-1]=cur;
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=tmp[i];
        }
    }

    // 测试函数
    public static void main(String[] args){
        int a[] = new int[]{1,2,3,0,0,0};
        int b[] = new int[]{2,5,6};
        Solution s = new Solution();
        s.merge(a,3,b,3);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
