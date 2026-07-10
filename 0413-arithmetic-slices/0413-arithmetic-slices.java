class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;


        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 2; j < n; j++) {

                int diff = nums[i + 1] - nums[i];
                boolean isArithmetic = true;

               
                for (int k = i + 1; k < j; k++) {
                    if (nums[k + 1] - nums[k] != diff) {
                        isArithmetic = false;
                        break;
                    }
                }

                if (isArithmetic) {
                    count++;
                }
            }
        }

        return count;
    }
}