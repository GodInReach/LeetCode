class Solution {
    public int maximum69Number (int num) {
        int l = Integer.toString(num).length();
        int[] arr = new int[l];
        int mx = 0;
        int done = 0;
        for( int i = l-1; i>=0; i--){
            arr[i]=num%10;
            num/=10;
        }
        for(int i : arr){
            if(done==0 && i==6){
                mx=mx*10+9;
                done=1;
            }
            else{
                mx=mx*10+i;
            }
        }
        return mx;
    }
}