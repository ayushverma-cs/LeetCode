class Solution {
    public int findComplement(int num) {
        int mass=1;
        while(mass<num){
            mass=(mass<<1)|1;

        }
        return num^mass;
    }
}