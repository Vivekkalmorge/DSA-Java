class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        int maxLen = 0;

        for(int num: nums){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }

        for(int num: frequency.keySet()){ 
            if(frequency.containsKey(num+1)){
                int currentLength = frequency.get(num) + frequency.get(num+1);
                maxLen = Math.max(maxLen,currentLength);
            }
        }

      return maxLen;
     
    }
    
}