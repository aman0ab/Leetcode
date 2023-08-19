class Solution {
    public int maxRepeating(String sequence, String word) {
        String found = word;
        int k = 0;
        while(sequence.contains(found)){
            found += word;
            k++;
        }
        return k;
    }
}