class Solution {
    public int strStr(String haystack, String needle) {
        int x=-1;
        if(haystack.contains(needle)){
            x=haystack.indexOf(needle);
        }
        return x;
        
    }
}