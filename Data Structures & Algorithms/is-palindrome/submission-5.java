class Solution {
    public boolean isPalindrome(String s) {
    
        int i = 0, j = s.length()-1;
        String str = s.toLowerCase();
        while(i<j){
            char a = str.charAt(i);
            char b = str.charAt(j);
            if(Character.isLetterOrDigit(a)){
                if(Character.isLetterOrDigit(b)){
                    if(a == b){
                        i++;
                        j--;
                    } else {
                        return false;
                    }

                } else {
                    j--;
                } 
            } else {
                    i++;
            }
        }
        return true;
    }
}
