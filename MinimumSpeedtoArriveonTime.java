
class Solution {
     public boolean isPossible(int[] dist, int speed, double hour) {
        double checker = 0 ;
        for(int i = 0 ; i< dist.length -1 ; i++){
            checker +=  Math.ceil(dist[i]* 1.0/speed);
        }
        checker += dist[dist.length -1]*1.0/speed;

        return checker<= hour;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        int start = 0 ;
        int end = (int) 1e7;
        int result = -1 ;
        
        while(start <= end){
           int mid = start + (end - start ) /2;
            if(isPossible(dist ,mid , hour )){
                result = mid;
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return result;
    }
}
