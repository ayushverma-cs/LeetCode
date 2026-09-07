class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]);
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int t=0;
        for(int i=0;i<=courses.length-1;i++){
            int dur= courses[i][0];
            int dead= courses[i][1];
            t+=dur;
            pq.add(dur);
        
        if(t>dead){
            int l=pq.poll();
            t-=l;
        }
    }
    return pq.size();
    }
}