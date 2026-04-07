class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // create an integer array of 26 elements to store counts of 26 alphabets
        // initialised by default to 0
        int[] count = new int[26];

        //run loop x times : to cover each element in both strings
        int i=0;
        while(i<s.length()){

            //increment - occurence of each alphabet in string s
            count[s.charAt(i) - 'a'] ++;

            //decrement - occurence of each alphabet in string t
            count[t.charAt(i) - 'a'] --;
            i++;
        }

        //loop for each element in count array
        for(int val : count){

            // if any of the values in count array is non zero means
            // the alphabets in strings t and s are not same/same frequency
            // so return false -- not anagrams
            if(val!=0) return false;
        }
        //return true finally since everything checks out
        return true;
    }
}
