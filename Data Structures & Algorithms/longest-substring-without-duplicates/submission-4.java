class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length() == 1) return s.length();
        Set<Character> a = new HashSet<Character>();
        int l = 0, r = 0, maxLen = 0;
        while(r < s.length()){
            while(a.contains(s.charAt(r))){
                a.remove(s.charAt(l));
                l++;
            }
            a.add(s.charAt(r));
            maxLen = Math.max(maxLen, r-l+1);

            r++;
        }
        return maxLen;
    }
}
