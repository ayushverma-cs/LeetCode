class Solution {
    public int numRescueBoats(int[] ppl, int limit) {
        Arrays.sort(ppl);
        int l=0;
        int r=ppl.length-1;
        int b=0;
        while(l<=r){
            if(ppl[l]+ppl[r]<=limit){
                l++;
                r--;
            }else{
                r--;

            }
            b++;
        }
        return b;
    }
}