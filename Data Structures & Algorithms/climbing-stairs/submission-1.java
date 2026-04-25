class Solution {
    public int climbStairs(int n) {
       Map<Integer, Integer> memo = new HashMap<>();
       return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo){
        //base case
        if(n==0 || n==1) return 1;
        //check map key 'n' not present? add 
        if(!memo.containsKey(n)){
            memo.put(n, climbStairs(n-2, memo)+climbStairs(n-1, memo));
        }

        return memo.get(n);
    }
}
