class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] l= new int[26];
        for(int i=0;i<s.length();i++){
            l[s.charAt(i)-'a']=i;

        }
        List<Integer> res = new ArrayList<>();
        int st=0;
        int e=0;
        for(int i=0;i<s.length();i++){
            e=Math.max(e,l[s.charAt(i)-'a']);
            if(i==e){
                res.add(e-st+1);
                st=i+1;
            }
        }
        return res;
        
    }
}