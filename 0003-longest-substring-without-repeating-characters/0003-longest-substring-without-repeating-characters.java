class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> hs = new HashSet<>();
         
         int maxLength = 0;
         int left = 0;

         for(int right=0;right<s.length();right++){
            
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }

            hs.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
         }
        
        return maxLength;
        
    }
}