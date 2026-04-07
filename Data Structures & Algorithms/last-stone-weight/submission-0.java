class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        for(int s : stones){
            maxHeap.add(s);
        }
        while(!maxHeap.isEmpty()){
            int s1 = maxHeap.poll();
            if(maxHeap.isEmpty()) return s1;
            int s2 = maxHeap.poll();
            int diff = Math.abs(s1 - s2);
            if(diff>0) maxHeap.add(diff);
        }
        return 0;
    }
}
