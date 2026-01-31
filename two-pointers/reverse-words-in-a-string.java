class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String x = "";
        for (int i = arr.length-1 ; i>=0 ; i-- ){
            if (arr[i]!="") x=x+arr[i]+" ";
        }
        return x.strip();
    }
}