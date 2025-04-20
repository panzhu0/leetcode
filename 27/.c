// 需要 [原地] 删除数据中的元素

int removeElement(int* nums, int numsSize, int val) {
    // 一个left 指针:用于确定数组的值
    // 一个right 指针,指向正在检测的Index
    int left = 0;
    for(int right=0;right<numsSize;right++){
        // 如果当前检测元素和val 的值相同
        if(nums[right] != val){
            nums[left] = nums[right];
            left ++;
        }
    }
    return left; // left 左边的元素就是去除val后的所有元素
}