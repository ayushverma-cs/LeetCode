class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int t=0;
        for(int i=0;i<boxTypes.length;i++){
            int b=Math.min(boxTypes[i][0],truckSize);
            t=t+b*boxTypes[i][1];
            truckSize -= b;
            if(truckSize==0) break;
        }
        return t;
        
        
    }
}