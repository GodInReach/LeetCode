class Solution {
    public int[] separateDigits(int[] nums) {
        int size = 0;
        for(int i : nums){
            size+=String.valueOf(i).length();
        }
        int[] arr = new int[size];
        size = 0;
        for (int i : nums){
            String j = String.valueOf(i);
            for(int k = 0; k<j.length(); k++){
                arr[size] = (j.charAt(k) - '0');
                size++;
            }
        }
        return arr;
    }
}