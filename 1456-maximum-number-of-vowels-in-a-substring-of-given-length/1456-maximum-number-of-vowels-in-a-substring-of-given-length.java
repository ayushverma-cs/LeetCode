class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int c = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {

  
            if (isVowel(s.charAt(r))) {
                c++;
            }

            if (r - l + 1 == k) {

              
                max = Math.max(max, c);

          
                if (isVowel(s.charAt(l))) {
                    c--;
                }

                l++;
            }
        }

        return max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}