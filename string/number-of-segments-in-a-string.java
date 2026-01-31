class Solution {
    public int countSegments(String s) {
        if(s.equals("")){
            return 0;
        }
        String[] arr = s.split(" ");
        int count = 0;
        for(String i : arr){
            if(!i.equals("")){
                count++;
            }
        }
        return count;
    }
}