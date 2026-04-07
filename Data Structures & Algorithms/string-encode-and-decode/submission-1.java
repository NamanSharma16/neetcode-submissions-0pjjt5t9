class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<String>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+len);
            strs.add(word);
            i = j+len+1;
        }
        return strs;
    }
}
