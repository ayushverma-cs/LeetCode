class Solution {
    public int minPatches(int[] nums, int n) {
        int i=0;
        long m=1;
        int p=0;
        while(m<=n){
            if(i<nums.length&& nums[i]<=m){
                m+=nums[i];
                i++;
            }else{
                m+=m;
                p++;
            }
        }
        return p;
    }
}