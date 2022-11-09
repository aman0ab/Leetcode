class Solution {
    public int findNumbers(int[] nums){
         
     /*
        
       Approach 1:

Here we are counting number of each digit of every element
for e.g 121 = 3 // as it has 3 digit 1,2,1.
we create variable even and increament it's value if digit has even digit
public int findNumbers(int[] nums) {
        int count = 0, evenNo = 0;
        for(int i = 0; i < nums.length; i++){
           int j = nums[i];
            while(j > 0){
                count++;
                j/= 10;
            }
          if(count %2 == 0)
              evenNo++;
            count = 0;
        }
      return evenNo;
    }
        
Approach 2:

We will use the method Stirng.valueOf
this will convert our integer element to a string
now, afterwards we can use length() to get the length of string
if length of string is even than we will increament even
    public int findNumbers(int[] nums){
        int even = 0;
       for(int i = 0; i < nums.length; i++){
           String a = String.valueOf(nums[i]);
           if(a.length()%2 == 0)
               even++;
       }
        return even;
	}
        
Approach 3:

Now, This is most effective approach to solve with 100% better space and time complexity
Looking carefully at constraints, we can say that our input integer array nums won't hold value more than 10^5 i.e 100000
that means
i > 9 ------ i < 99 == even
i > 999 ------ i < 9999 == even
also need to take in consideration
i == 100000 is even no.
    
    */
        
        int even = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>9 && nums[i]<100 || nums[i]>999 && nums[i]<10000 || nums[i] == 100000)
                even++;
        } 
        return even;
    }
}