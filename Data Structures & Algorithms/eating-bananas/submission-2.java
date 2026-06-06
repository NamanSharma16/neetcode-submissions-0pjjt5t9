class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int res = high;
        
        while(low<=high){
            int mid = (high+low)/2;

            long totalTime = 0;
            for(int p : piles){
                totalTime += Math.ceil((double)p/mid);
            }
            if(totalTime <= h){
                res = mid;
                high = mid - 1;
            }else if(totalTime > h){
                low = mid+1;
            }
        }
        return res;
    }
}
