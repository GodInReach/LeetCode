class Solution {
    public int smallestEvenMultiple(int n) {
        while(true){
            if(n%2!=0){
                n*=2;
            }
            else{
                return n;
            }
        }
    }
}