class Solution {
    public boolean canAliceWin(int[] nums) {
        int sin = 0;
        int dob = 0;
        for(int i : nums){
            if(i>9){dob+=i;}
            else{sin+=i;}
        }
        if(sin!=dob){
            return true;
        }
        else{
            return false;
        }

    }
}