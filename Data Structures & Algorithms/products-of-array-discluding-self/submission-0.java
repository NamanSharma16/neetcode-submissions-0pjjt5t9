class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        int prod = 1;
        int zeroctr = 0;
        for(int n : nums){
            if(n!=0){
                prod = prod * n;
            } else {
                zeroctr++;
            }
        }
        if(zeroctr > 1){
            return new int[size];
        }

        for(int i=0; i < size; i++){
            if(zeroctr > 0){
                res[i] = (nums[i] == 0)? prod : 0;
            } else {
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
