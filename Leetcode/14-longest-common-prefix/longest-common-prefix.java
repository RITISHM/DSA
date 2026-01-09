class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        for (int i=0;i<strs[0].length();i++){
            boolean found=true;
            boolean b=false;
            String check=strs[0].substring(0,i+1);
            for (int j=1;j<strs.length;j++){ 
                if (!strs[j].startsWith(check)){
                    found=false;
                    b=true;
                    break;
                }
            }
            if (b)break;
            if (found) ans=check;
        }
        return ans;
    }
}