class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for(String s1 : word1){
            a += s1;
        }
        for(String s2 : word2){
            b += s2;
        }
        if(a.equals(b)) return true;
        return false;
    }
}