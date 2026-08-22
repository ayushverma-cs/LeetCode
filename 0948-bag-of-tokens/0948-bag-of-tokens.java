class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0;
        int r= tokens.length-1;
        int s=0;
        int maxS=0;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                l++;
                s++;
                maxS=Math.max(maxS,s);
            }else if(s>0){
                power+=tokens[r];
                r--;
                s--;
            }
            else{
                break;
            }
        }
        return maxS;
        
    }
}