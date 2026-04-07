class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            //initialize an integer array of 26 size for each of alphabets frequency
            //[0,0,...till 26 places]
            int[] count = new int[26];
            //convert string/word into a character array ['c','a','t']
            char[] ch = str.toCharArray();
            //loop for each character and increment its value in alphabet array
            for(char c : ch){
                count[c - 'a']++;
            }
            //create a String KEY for hashmap
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());

            //add the respective word/anagram input string into
            //respsctive bucket against key - since key would always be unique
            map.get(key).add(str);
        }
        //make a new array list to return all values in sequence
        return new ArrayList<>(map.values());
    }
}
