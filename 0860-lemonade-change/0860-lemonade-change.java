class Solution {
    public boolean lemonadeChange(int[] b) {
        int f=0;
        int t=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==5) f++;
            else if(b[i]==10){
                if(f==0){
                    return false;
                }else{
                    f--;
                    t++;
                }
                
            }
            else{

                if(f>0&&t>0){
                    t--;
                    f--;
                }else if(f>=3){
                    f-=3;
                }
                else{
                    return false;
                }
                
            }

        }
        return true;
    }
        
    }
