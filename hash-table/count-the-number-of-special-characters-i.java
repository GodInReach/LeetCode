class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> l = new HashSet<>();
        HashSet<Character> h = new HashSet<>();
        for(char i : word.toCharArray()){
            if(Character.isLowerCase(i)){l.add(i);}
            else{h.add(i);}
        }
        int count=0;
        for(char i : l){
            if(h.contains(Character.toUpperCase(i))){count++;}
        }
        return count; 
    }
}