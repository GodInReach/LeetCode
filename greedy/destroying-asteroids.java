class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long masss = mass;
        for(int i = 0; i<asteroids.length; i++){
            if(asteroids[i]<=masss){
                masss+=asteroids[i];
                System.out.println(masss);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
