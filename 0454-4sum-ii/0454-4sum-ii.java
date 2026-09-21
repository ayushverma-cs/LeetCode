class Solution {
    public int fourSumCount(int[] num1, int[] num2, int[] num3, int[] num4) {
        HashMap<Integer, Integer> mpp= new HashMap<>();
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                int s= num1[i]+num2[j];
                mpp.put(s,mpp.getOrDefault(s,0)+1);
            }
        }
        int c=0;
        for(int i=0;i<num3.length;i++){
            for(int j=0;j<num4.length;j++){
                int s= num3[i]+num4[j];
                int n=-s;
                if(mpp.containsKey(n)){
                    c+=mpp.get(n);
                }
            }
        }
        return c;
        
    }
}