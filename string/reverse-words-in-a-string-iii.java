class Solution {
    public String reverseWords(String s) {
        StringBuilder op = new StringBuilder();
        String[] arr = s.split(" ");
        for(String i : arr){
            StringBuilder temp = new StringBuilder(i);
            op.append(temp.reverse());
            op.append(" ");
        }
        return op.toString().trim();
    }
}