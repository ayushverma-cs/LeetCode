class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int s=0, i=0;
        int f= startFuel;
        while(f<target){
            while(i<stations.length  && stations[i][0]<=f){
            pq.add(stations[i][1]);
            i++;
            }
            if(pq.isEmpty()){
                return -1;
            }
            f+=pq.poll();
            s++;
        } 
        return s;
        
    }
}