class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //finding max in hashmap and eliminate from hashmap once max is found

        int[] ans = new int[k];
        
        for(int i = 0; i < k; i++){
            int max = 0, key_max = 0;
            for(Map.Entry<Integer, Integer> e : map.entrySet()){

                if(max < e.getValue()){
                    max = e.getValue();
                    key_max = e.getKey();
                }
            }
            ans[i] = key_max;
            map.remove(key_max);
        }
        return ans;
    }
}
