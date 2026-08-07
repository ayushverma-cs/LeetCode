class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>f= new HashMap<>();
        for(int  n: nums){
            f.put(n,f.getOrDefault(n,0)+1);

        }
        int a=0;
        for(int k: f.keySet()){
            if(f.containsKey(k+1)){
                a=Math.max(a,f.get(k)+f.get(k+1));
            }
        }
        return a;
    }
    
}