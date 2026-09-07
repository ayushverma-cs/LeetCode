class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer>q= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(q.contains(nums[i])){
                return true;
            }
            q.add(nums[i]);

        }
        return false;
    }
}