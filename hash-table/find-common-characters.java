class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> li = new ArrayList<>();
        int[] comm = new int[26];
        Arrays.fill(comm, 50);
        for(String s : words){
            int[] chars = new int[26];
            for(int i = 0; i<s.length(); i++){
                chars[s.charAt(i)-'a']++;
            }
            for(int i = 0; i<26; i++){
                comm[i] = Math.min(comm[i],chars[i]);
            }
        }
        for(int i = 0; i<26; i++){
            if(comm[i]!=0 && comm[i]!=50){
                for(int j = 0; j<comm[i]; j++){
                    li.add((char)(i+'a')+"");
                }
            }
        }
        return li;
    }
}