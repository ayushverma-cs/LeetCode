class Solution {
    public int findMinArrowShots(int[][] p) {
        Arrays.sort(p,(a,b)->Integer.compare(a[1],b[1]));
        int a=1;
        int ap=p[0][1];
        for(int i=0;i<p.length;i++){
            if(p[i][0]>ap){
                a++;
                ap=p[i][1];
            }
        }
        return a;
    }
}