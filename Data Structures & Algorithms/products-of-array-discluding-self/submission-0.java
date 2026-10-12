class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        int rightProduct= 1;
        int leftProduct = 1;
        for(int i=0; i<nums.length; i++){
            output[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            output[i] = rightProduct * output[i];
            rightProduct = rightProduct * nums[i];
        }
        return output;
    }
}  
