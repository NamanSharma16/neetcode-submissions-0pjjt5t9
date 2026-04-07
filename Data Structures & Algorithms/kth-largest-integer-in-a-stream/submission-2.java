class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int popTimes;
    
    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>();
        this.popTimes = k;
        for(int n : nums){
            minHeap.add(n);
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        while(minHeap.size() > popTimes){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
