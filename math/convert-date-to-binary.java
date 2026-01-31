class Solution {
    public String convertDateToBinary(String date) {
        String[] spl = date.split("-");
        String bin = "";
        for(String i : spl){
            bin+=Integer.toBinaryString(Integer.parseInt(i));
            bin+="-";
        }
        return bin.substring(0,bin.length()-1);
    }
}