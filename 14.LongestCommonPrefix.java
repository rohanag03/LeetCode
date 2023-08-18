class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=0;
        for(int i=0;i<strs[0].length();i++){
            int a =1;
            for(int j=0;j<strs.length;j++){
                if(l>=strs[j].length() || strs[j].charAt(l)!=strs[0].charAt(l)){
                    a = 0;
                    break;
                }
            }
            if(a==1){
                l++;
            }
            else{
                break;
            }
        }
        return strs[0].substring(0,l);
    }
}