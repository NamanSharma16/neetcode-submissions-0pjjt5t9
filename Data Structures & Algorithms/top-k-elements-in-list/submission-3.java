class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        // add frequency and element in a hashmap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }  
        // creating a min heap, so that lowest freq element stays at top priority
        Queue<Integer> q = new PriorityQueue<>((a,b) -> freqMap.get(a) - freqMap.get(b)); 
        for(int key : freqMap.keySet()){
            q.add(key);
            //if size of queue increases more than k, remove lowest freq 
            if(q.size() > k){
                q.poll();
            }
        }
        while(k-- > 0){
            res[k]= q.poll();
        }
    

        return res;
    }
}
