class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        int L = 0, R = 1; 
        int longest = 1;
        HashSet<Character> cs = new HashSet<>();
        cs.add(s.charAt(L));
        while(R < s.length()){
            if(!cs.contains(s.charAt(R))){
                cs.add(s.charAt(R));
                R++;
            } else {
                L++;
                R = L+1;
                longest = (cs.size()>longest) ? cs.size():longest;
                cs.clear();
                cs.add(s.charAt(L));
            }
        }
        return (cs.size()>longest) ? cs.size():longest;
    }
}
