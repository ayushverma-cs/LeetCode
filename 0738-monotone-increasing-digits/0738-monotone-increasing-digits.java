class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] d= String.valueOf(n).toCharArray();
        int m= d.length;
        for(int i=d.length-1;i>0;i--){
            if(d[i]<d[i-1]){
                d[i-1]--;
                m=i;
            }
        }
        for(int i= m;i<d.length;i++){
            d[i]='9';
        }
        return Integer.parseInt(new String(d));


    }
}