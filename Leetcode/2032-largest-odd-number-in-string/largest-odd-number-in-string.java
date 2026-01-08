class Solution {
    public String largestOddNumber(String num) {
        String ans ="";
        int i;
        for (i=num.length()-1;i>=0;i--){
            char c=num.charAt(i);
            if ((c-'0')%2==1){
                break;
            }
        }
        if (i==-1)return "";
        return num.substring(0,i+1);
    }
}