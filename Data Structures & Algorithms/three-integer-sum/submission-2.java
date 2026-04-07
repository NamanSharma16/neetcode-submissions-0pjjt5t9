class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        if(nums[0] > 0) return triplets; // to optimize 

        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            if(nums[i] > 0) break;

            twoSum(-nums[i], nums, i+1, triplets);
        }
        return triplets;
    }
    private void twoSum(int target, int[] nums, int j, List<List<Integer>> triplets){
        int k = nums.length - 1;
        
        while(j < k){
            int sum = nums[j] + nums[k];
            if(sum == target){
                triplets.add(Arrays.asList(-target, nums[j], nums[k]));
            

                while(j<k && nums[j] == nums[j+1]) j++;
                while(j<k && nums[k] == nums[k-1]) k--;

                j++; k--;
            } else if(sum < target) {
                j++;
            } else k--;

        }
    
     
    }
}
