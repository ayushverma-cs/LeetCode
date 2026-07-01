class Solution {
    public boolean detectCapitalUse(String word) {
        int up=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                up++;
            }
        }
        return up==word.length() || up==0|| up==1 && (Character.isUpperCase(word.charAt(0)));

        
    }
}