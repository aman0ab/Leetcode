class Solution {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        for (int i = 0; i < n; i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                if (compare(haystack, needle, i)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static boolean compare(String haystack,String needle,int index){
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i < m; i++){
            if (index >= n) return false;
            if (haystack.charAt(index++) != needle.charAt(i)) return false;
        }
        return true;
    }
}