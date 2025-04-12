
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int i;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(i=0;i<n;i++){
           int num = nums[i];

           if(map.containsKey(num)){
            int prevIndex = map.get(num);
                if (i - prevIndex <= k) {
                    return true;
                }

                
           }
                       map.put(num, i);

        }

        return false;
        
    }
}