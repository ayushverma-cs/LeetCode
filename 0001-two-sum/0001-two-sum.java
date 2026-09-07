class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int l= target-nums[i];
            if(map.containsKey(l)){
                return new int[]{map.get(l),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
        
    }
}