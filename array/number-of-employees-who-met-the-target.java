class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int x = 0;
        for(int i : hours){
            if(i>=target){
                x++;
            }
        }
        return x;
    }
}