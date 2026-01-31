public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int min = 1;
        int max = n;
        int mid = 0;
        while (min<=max) {
            mid = min+(max-min)/2;
            if(guess(mid)==0){
                return mid;
            }
            else if(guess(mid)<0){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return 0;
    }
}