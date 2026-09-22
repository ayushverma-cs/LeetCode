class Solution {
    public int majorityElement(int[] nums) {
        int cand=0;
        int c=0;
        for(int num:nums){
             if(c==0){
                cand=num;
                c=1;
            }
            else if(num==cand){
                c++;
            }
            else{
                c--;
            }
           
            
        }
        return cand;
        
    }
}