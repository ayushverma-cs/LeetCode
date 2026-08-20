class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int l=0;
        int s=0;
        int c=0;

        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            if(i-l+1==k){
                if(s>=k*threshold){
                    c++;
                }
            
            s-=arr[l];
            l++;
            }


        }
        return c;
        
    }
}