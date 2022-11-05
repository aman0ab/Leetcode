class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> ans = new ArrayList<>();
        
        //brute force approach tc -> o(n^2) sc -> o(n)
        
        /*
          for (int i = 0; i < candies.length; i++) {
            boolean test = false;
            for (int j = 0; j < candies.length; j++) {
                if (candies[i] + extraCandies < candies[j]){
                    test = true;
                    break;
                }
            }
            if (test){
                ans.add(false);
            }else {
                ans.add(true);
            }
        }
        return ans;
        */
        
        //Optimised approach tc and sc -> o(n)
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; ++i){
            max = Math.max(candies[i] , max);
        }
        for(int i = 0; i < candies.length; ++i){
           if(candies[i] >= max - extraCandies){
               ans.add(true);
           }else{
               ans.add(false);
           }
        }
        return ans;
    }
}