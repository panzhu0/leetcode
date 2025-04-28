void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    // 双指针法
    int p=0,q=0;
    int cur;
    int *tmp = (int*)malloc(sizeof(int) * (m+n));
    while(p<m || q<n){
        if(p==m){
            tmp[p+q-1] = nums2[q++];
        }else if(q==n){
            tmp[p+q-1] = nums1[p++];
        }else if(nums1[p] < nums2[q]){
            tmp[p+q-1] = nums1[p++];
        }else{
            tmp[p+q-1] = nums2[q++];
        }
    }
    for(int i=0;i<m+n;i++){
        nums1[i]=tmp[i];
    }
}