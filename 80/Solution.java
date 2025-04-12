

class Solution {
    public int removeDuplicates(int[] nums) {
        // 快慢指针
        int n = nums.length;
        // 如果数组长度<=2 直接返回
        if(n <= 2){
            return n;
        }
        int slow = 2, fast = 2; // 直接从2开始

        // fast 检测
        while(fast < n){
            if(nums[slow -2] != nums[fast]){ // nums[0] != nums[2] 
                nums[slow] = nums[fast];
                ++ slow;
            }
            ++fast;
        }
        return slow;
    }
}