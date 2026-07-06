class Solution {
    public int mySqrt(int x) {
        int st = 0, end = x;
        while (st <= end) {
            long mid = st + (end - st) / 2;
            long sq = mid * mid;

            if (sq == x) {
                return (int) mid;   
            } else if (sq < x) {
                st = (int) mid + 1;
            } else {
                end = (int) mid - 1;
            }
        }
        return end; 
    }
}