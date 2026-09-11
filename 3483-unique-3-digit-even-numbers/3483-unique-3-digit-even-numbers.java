class Solution {
    public int totalNumbers(int[] digits) {
        int f[] = new int[10];
        for(int d:digits){
            f[d]++;
        }
        int c=0;
        for(int l=0;l<=8;l+=2){
            if(f[l]==0) continue;
        
        f[l]--;
        
        for(int fi=1;fi<=9;fi++){
           if( f[fi]==0) continue; 
        
        f[fi]--;
        
        for(int m=0;m<=9;m++){
            if(f[m]==0) continue;
            c++;
        }
        f[fi]++;

        }
        f[l]++;
    }
    return c;
    }
}