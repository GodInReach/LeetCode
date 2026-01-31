class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder mn = new StringBuilder();
        if(k>s.length()){
            mn.append(s);
            return mn.reverse().toString();
        }
        StringBuilder temp = new StringBuilder();
        int chars = 0;
        int batch = 0;
        for(int i = 0; i<s.length(); i++){
            if(chars<k && batch%2==0){
                temp.append(s.charAt(i));
                chars++;
            }
            else {
                mn.append(s.charAt(i));
                chars++;
            }
            if(chars==k){
                if(batch%2==0){
                    mn.append(temp.reverse());
                    temp.setLength(0);
                }
                batch++;
                chars=0;
            }
        }
        if (chars > 0 && batch % 2 == 0) {
            mn.append(temp.reverse());
        }
        return mn.toString();
    }
}