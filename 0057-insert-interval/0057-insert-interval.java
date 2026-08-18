class Solution {
    public int[][] insert(int[][] in, int[] newInt) {
        List<int[]>ans= new ArrayList<>();
        int i=0;
        int n= in.length;
        while(i<n && in[i][1]<newInt[0]){
            ans.add(in[i]);
            i++;
        }
        while(i<n && in[i][0]<=newInt[1]){
            newInt[0]=Math.min(newInt[0],in[i][0]);
            newInt[1]=Math.max(newInt[1],in[i][1]);
            i++;
        }
        ans.add(newInt);
        while(i<n){
            ans.add(in[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}