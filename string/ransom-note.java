//G!R!
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()){return false;}
        Map<Character,Integer> m1 = new LinkedHashMap<Character,Integer>();
        Map<Character,Integer> m2 = new LinkedHashMap<Character,Integer>();
        for (int i = 0; i<magazine.length(); i++){
            if (i<ransomNote.length()){
                m1.merge(ransomNote.charAt(i),1, Integer::sum);
            }
            m2.merge(magazine.charAt(i),1,Integer::sum);
        }
        try{
            for(char i : m1.keySet()){
                if (m2.get(i)<m1.get(i)){
                    return false;
                }
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }

    }
}