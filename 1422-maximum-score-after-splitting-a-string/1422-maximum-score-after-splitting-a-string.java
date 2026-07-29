class Solution {
    public int maxScore(String s) {
        int max = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            String left = s.substring(0, i + 1);
            String right = s.substring(i + 1);

            int zeros = 0;
            int ones = 0;

            for (int j = 0; j < left.length(); j++) {
                if (left.charAt(j) == '0')
                    zeros++;
            }

            for (int j = 0; j < right.length(); j++) {
                if (right.charAt(j) == '1')
                    ones++;
            }

            max = Math.max(max, zeros + ones);
        }

        return max;
    }
}