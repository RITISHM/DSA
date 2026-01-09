class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<strs[0].length();i++){
            boolean found=true;
            boolean b=false;
            char c=strs[0].charAt(i);
            for (int j=1;j<strs.length;j++){
                if (i==strs[j].length()){
                    b=true;
                    break;
                }
                if (strs[j].charAt(i)!=c){
                    found=false;
                    b=true;
                    break;
                }
            }
            if (b)break;
            if (found) sb.append(c);
        }
        return sb.toString();
    }
}