class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int ans = 10;
        int count = 9;

        for (int digits = 2; digits <= n; digits++) {
            count *= (11 - digits);
            ans += count;
        }

        return ans;
    }
}