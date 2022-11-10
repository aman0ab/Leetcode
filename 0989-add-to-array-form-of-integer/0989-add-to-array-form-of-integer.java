class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {        
/*
BASIC IDEA

Basic Idea behind this implementation is to add the num array element one by one with the k
eg:
num[] = {1, 2, 3} and k = 45;
1st Iteration:
k += num[len--] --> k = k + num[2] --> k = 45 + 3 --> k = 48
list.addFirst(k % 10) --> list.addFirst(48 % 10) --> list.addFirst(8) --> [8]
k /= 10 --> k = k / 10 --> 48 / 10 --> k = 4

2nd Iteration:
k += num[len--] --> k = k + num[1] --> k = 4 + 2 --> k = 6
list.addFirst(k % 10) --> list.addFirst(6 % 10) --> list.addFirst(6) --> [6, 8]
k /= 10 --> k = k / 10 --> 6 / 10 --> k = 0

3rd Iteration:
k += num[len--] --> k = k + num[0] --> k = 0 + 1 --> k = 1
list.addFirst(k % 10) --> list.addFirst(1 % 10) --> list.addFirst(1) --> [1, 6, 8] <--- Desired Output
k /= 10 --> k = k / 10 --> 1 / 10 --> k = 0
*/
        
        List<Integer> list = new ArrayList<Integer>();
        int nums = num.length - 1;
        while(nums >= 0 || k!=0){
            if(nums >= 0){
                k += num[nums];
                --nums;
            }
            list.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}