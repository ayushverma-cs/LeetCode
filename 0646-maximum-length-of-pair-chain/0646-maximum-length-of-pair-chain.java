class Solution {
    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int last= Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>last){
                c++;
                last= pairs[i][1];
            }
        } 
        return c;
        
    }
}