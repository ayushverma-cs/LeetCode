class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int sum=0;
        int t=0;
        for(int i=s.length-1;i>=0;i--){
            sum+=s[i];
            if(sum<=0){
                break;
            }
            t+=sum;

        }
        return t;
        
    }
}