class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)) return true;
        int l = 0, r = s.length();
        while(l<r){
            if(s.charAt(l) == s.charAt(r-1)){
                l++; r--;
            } else {
                return isPalindrome(s.substring(l+1, r)) || isPalindrome(s.substring(l, r-1));
            }
        }
        return true;
    }

    private boolean isPalindrome(String p){
        int l = 0, r = p.length()-1;
        while(l<r){
            if(p.charAt(l) != p.charAt(r)) return false;
            else {
                l++; 
                r--;
            }
        }
        return true;
    }
}