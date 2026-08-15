class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]!=b[0]){
            return b[0]-a[0];

        }
        return a[1]-b[1];
        });
        List<int[]> list= new ArrayList<>();
        for(int i=0;i<people.length;i++){
            int [] per= people[i];
            int k= per[1];
            list.add(k,per);
        }
        
        return list.toArray(new int[people.length][]);
    }
        
    
}