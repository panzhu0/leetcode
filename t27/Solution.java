// 没有包名 导入不了,指定包名为test
package t27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        // 直接双指针, 找到相同的数据就把他的值


        // 遍历数组
        int count = 0;
        // 2 3 2 3
        // 
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                System.out.println(i);
                for(int j=i;j<nums.length-1;j++){
                    // 前移
                    nums[j]=nums[j+1]; 
                    count ++;
                }
            }
        }
        return nums.length - count;
    }
}