class Solution {
    public double average(int[] salary) {
       int max = salary[0];
        int min = salary[0];
        int total = 0;
        for(int i = 0; i < salary.length; ++i){
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            total += salary[i];
        }
        double sum = (total - (min + max));
        return (sum/(salary.length - 2));
    }
}