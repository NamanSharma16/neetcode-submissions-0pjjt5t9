class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> strSet = new HashSet<>();
        int maxLen = 0;
        int l = 0;
        for(int r = 0; r<s.length(); r++){
            while(strSet.contains(s.charAt(r))){
                strSet.remove(s.charAt(l));
                l++;
            }
            strSet.add(s.charAt(r));
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
