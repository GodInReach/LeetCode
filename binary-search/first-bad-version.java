public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int min = 1;
        int max = n;
        int mid = 0;
        while(min<=max){
            mid = min+(max-min)/2;
            if(isBadVersion(mid)==false){
                min = mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return min;
    }
}