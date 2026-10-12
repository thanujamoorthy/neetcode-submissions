class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int i =0; i<nums.length;  i++){
        set.add(nums[i]);
       }
       int longest = 0; 
       for(int i=0; i< nums.length; i++){
        int num1 = nums[i];
        
        if(!set.contains(num1-1)){
            int length = 1;
            while(set.contains(num1+length)){
            length++;
            }
            longest = Math.max(longest, length);
        }
       }
       return longest;

    }
}
