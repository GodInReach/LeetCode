class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String i : operations){
            if(i.charAt(1)=='+'){x++;}
            else{x--;}
        }
        return x;
    }
}