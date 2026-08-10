class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] a=new int [n];
        int p=1;
        for(int i=0;i<n;i++){
            a[i]=p;
            p*=nums[i];
        }
        int s=1;
        for(int i=n-1;i>=0;i--){
            a[i]*=s;
            s*=nums[i];
        }
    
    return a;
    }
}