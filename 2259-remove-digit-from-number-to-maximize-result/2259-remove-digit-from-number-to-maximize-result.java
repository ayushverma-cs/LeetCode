class Solution {
    public String removeDigit(String num, char digit) {
       int l =-1;

       for(int i=0;i<num.length();i++){

        if(num.charAt(i)==digit){
            l=i;
            if(i+1<num.length()&& num.charAt(i+1)>num.charAt(i)){
                return  num.substring(0,i)+num.substring(i+1);
            }
        }
        
       }


        return num.substring(0,l)+ num.substring(l+1);
       }

        
    }

