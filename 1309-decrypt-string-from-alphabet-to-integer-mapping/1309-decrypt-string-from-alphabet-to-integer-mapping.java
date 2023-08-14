class Solution {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()){
            if ((i + 2) < s.length() && s.charAt(i + 2) == '#'){
                String str = s.substring(i, i + 2);
                int temp = Integer.parseInt(str);
                sb.append((char)(96 + temp));
                i += 3;
            }else{
                char ch = s.charAt(i);
                sb.append((char)(ch + 48));
                i++;
            }
        }
        return sb.toString();
    }
}