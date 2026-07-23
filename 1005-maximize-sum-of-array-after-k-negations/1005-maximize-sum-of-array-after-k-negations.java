class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
       
        
        for(int i=0;i<nums.length&& k>0;i++){

           if(nums[i]<0){
            nums[i]=-nums[i];
            k--;
            
            
           }
        }
           int s=0;
           int sm=Integer.MAX_VALUE;
           for(int i=0;i<nums.length;i++){
           s+=nums[i];
           sm= Math.min(sm,nums[i]);
           }
           if(k%2!=0){
            s-=2*sm;
           }
           return s;
       
        
    }
}