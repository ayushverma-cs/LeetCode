class Solution {
    public int candy(int[] ratings) {
        int n= ratings.length;
        int[] c=new int[n];
        Arrays.fill(c,1);
        boolean ch=true;
        while(ch){
             ch=false;


            for(int i=0;i<n;i++){
                if(i>0&& ratings[i]>ratings[i-1]&& c[i]<=c[i-1]){
                    c[i]=c[i-1]+1;
                    ch=true;
                }
                if(i<n-1&& ratings[i]>ratings[i+1]&& c[i]<=c[i+1]){

                    c[i]=c[i+1]+1;
                    ch=true;
                }
            }
        }
        int sum=0;
        for(int i=0;i<c.length;i++){
            sum+=c[i];
        }
        return sum;
        
    }
}