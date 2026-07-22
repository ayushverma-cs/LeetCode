class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) 
    {
        int m= c[0];
        for(int i=0;i<c.length;i++){
            if(c[i]>m){
                m=c[i];
            }
        }
        List<Boolean>r=new ArrayList<>();
        for(int i=0;i<c.length;i++){
        if(c[i]+e>=m){
            r.add(true);

        }
        else{
            r.add(false);
        }
        }
        return r;

        
    }
}