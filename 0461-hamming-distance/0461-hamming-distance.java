class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int c=0;

        while(xor>0){
            if(xor%2!=0){
                c++;
            }
            xor=xor/2;
        }
        return c;
        
    }
}