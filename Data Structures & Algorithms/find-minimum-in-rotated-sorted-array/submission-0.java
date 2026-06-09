class Solution {
    public int findMin(int[] nums) {
        // if(nums[0] < nums[nums.length-1])
        //     return nums[0];
        
        int r = nums.length-1;
        int l = 0;
        int res = nums[0];
        while(l<=r){
           if(nums[l] <= nums[r]){
            return res = Math.min(res,nums[l]);
           }else{
            int mid = (l + r)/2;
            res = Math.min(res,nums[mid]);
            if(nums[l] <= nums[mid]){
                l = mid + 1;
            }else{
                r = mid-1;
            }
           }
        }
        return res;

    }
}
