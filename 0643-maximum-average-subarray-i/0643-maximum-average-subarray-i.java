class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int n = nums.length;
    double windowSum = 0;
    double max = 0;

    for(int i=0;i<k;i++){
        windowSum+= nums[i];
    }
            max = windowSum; 

    for(int i=k;i<n;i++){
        windowSum+= nums[i] - nums[i-k];
        max = Math.max(windowSum,max);
    }

        return max/k;

    }

}