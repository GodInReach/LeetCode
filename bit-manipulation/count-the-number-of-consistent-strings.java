class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i<allowed.length(); i++){
            s.add(allowed.charAt(i));
        }
        for(String st : words){
            for(int j = 0; j<st.length(); j++){
                if (!s.contains(st.charAt(j))){
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}