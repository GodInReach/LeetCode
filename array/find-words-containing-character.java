class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        var ls = new ArrayList<Integer>();
        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<words[i].length(); j++){
                if(x==words[i].charAt(j)){
                    ls.add(i);
                    break;
                }
            }
        }
        return ls;
    }
}