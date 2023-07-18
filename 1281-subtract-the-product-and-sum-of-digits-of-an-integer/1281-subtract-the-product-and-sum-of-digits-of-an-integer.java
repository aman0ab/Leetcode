class Solution {
    public int subtractProductAndSum(int n) {
        int rem,result;
        int sum = 0;
        int mul = 1;
        while(n != 0){
            rem = n % 10;
            n /= 10;
            
            sum += rem;
            mul *= rem;
        }
        return mul - sum;
    }
}