class Solution {
    public String trimTrailingVowels(String s) {
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if((c!='a' && c!='e' && c!='i' && c!='o' && c!='u') || flag == 1){
                sb.insert(0,c);
                flag=1;
            }

        }
        return sb.toString();
    }
}