class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double currsum = 0;
        int i;

        for(i=0;i<k;i++){
            currsum += (nums[i]);
        }

        double maxsum = currsum;

        for(i=1;i<=n-k;i++){
            currsum =  currsum - nums[i-1] + nums[i+k-1];
           maxsum= Math.max(maxsum,currsum);
        }
        return maxsum/k;
    }
}