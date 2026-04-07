class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->a[0] - b[0]);

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            heap.offer(new int[]{m.getValue(),m.getKey()});
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        for(int i=0; i< k; i++){
            res[i] = heap.poll()[1];
        }
        return res;
    }
}
