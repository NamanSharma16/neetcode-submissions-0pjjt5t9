class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int popTimes;
    
    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        popTimes = k;
        for(int n : nums){
            minHeap.add(n);
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        int i=1;
        while(minHeap.size() > popTimes){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
