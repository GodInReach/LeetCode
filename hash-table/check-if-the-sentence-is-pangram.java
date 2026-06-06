class Solution {
    public boolean checkIfPangram(String sentence) {
        int flag = 0;
        for(int i = 0; i<sentence.length(); i++){
            flag |= (1<<(sentence.charAt(i)-'a'));
        }
        if(flag == (1<<26)-1){
            return true;
        }
        return false;
    }
}