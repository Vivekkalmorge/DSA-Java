class Solution {
    public int minEatingSpeed(int[] piles, int h) {
 
        int maxPile = 0;
        for(int pile:piles){
            maxPile = Math.max(maxPile,pile);
        }

        int start = 1;
        int end = maxPile;

        while (start<end){
           int mid = start + (end - start) / 2;

            if(canEatAll(piles, mid, h)){
                end = mid;
            }
            else{
                start = mid + 1;
            }

        }

        return start;

       
    }

     private boolean canEatAll(int[] piles, int k, int h) {
            int hoursNeeded = 0;

            for(int pile: piles){
                hoursNeeded += Math.ceil(pile / (double) k);

                if(hoursNeeded > h){
                    return false;
                }
            }

            return true;
        }
}