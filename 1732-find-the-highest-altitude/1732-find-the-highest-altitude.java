class Solution {
    public int largestAltitude(int[] gain) {
        //The biker starts his trip on point 0 with altitude equal 0.
        int current = 0;
        int max = 0;
        for(int i = 0; i < gain.length; ++i){
            //add and calculate all gain 
            current += gain[i];
            //after calculate compared max with current element 
            max = Math.max(max, current);
            //max will return the highest altitude
        }
        return max;
    }
}