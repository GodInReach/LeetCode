class Solution {
    public String triangleType(int[] nums) {
        int x = nums[0];
        int y = nums[1];
        int z = nums[2];
        if(x+y<=z || y+z<=x || x+z<=y){
            return "none";
        }
        if(x==y&&y==z){
            return "equilateral";
        }
        else if(x==y||y==z||x==z){
            return "isosceles";
        }
        else if(x+y>z||y+z>x||x+z>y){
            return "scalene";
        }
        return "none";
    }
}