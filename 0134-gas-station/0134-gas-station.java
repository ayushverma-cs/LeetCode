class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s=0,t=0,total=0;
        for(int i=0;i<gas.length;i++){
            int d= gas[i]-cost[i];
            total+=d;
            t+=d;
            if(t<0){
                s=i+1;
                t=0;
               
            }
        }  
        if(total>=0){
                return s;

            }
           
             return -1;
        }
}
        
        


        
 