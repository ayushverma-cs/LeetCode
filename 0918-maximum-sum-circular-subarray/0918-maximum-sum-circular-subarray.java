class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int sum = 0;
        int total = 0;

       
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];

            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
            
        }
        if(max<0){
            return max;
        }

        

        
        sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum < min) {
                min = sum;
            }

            if (sum > 0) {
                sum = 0;
            }
        }

        return Math.max(max, total - min);
    }
}