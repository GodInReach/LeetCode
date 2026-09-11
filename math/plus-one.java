class Solution {
    public int[] plusOne(int[] dig){
        int len = dig.length;
        int[] op = new int[len+1];
        int rem = 1;
        for(int i = len; i>0; i--){
            if(dig[len-1]==9){
                op[i]=0;
                rem = 1;
            }
            else{
                op[i]=dig[i-1]+rem;
                rem = 0;
            }
        }
        op[0]+=rem;
        if(op[0] == 0){
            return Arrays.copyOfRange(op,1,op.length);
        }
        else return op;
    }
}