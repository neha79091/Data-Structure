//here I am using currentSum and runningSum to keep track of maximum sum,
// we have to take runningSum=nums[0] because if there is only one negative element in array currentSum will be reset
//to zero and it wil not take negative value in line no 18. I am setting currentSum=0 whenever I get a negative number because
//we need to get max sum and including negative values will decrease our sum and we'll get wrong ans
class Solution {
    public int maxSubArray(int[] nums)
    {
        int runningSum=nums[0];
        int currentSum=0;
        if(nums.length==0)
        {
            return 0;
        }

        for(int i=0;i<nums.length;i++)
        {
            currentSum+=nums[i];
            runningSum=Math.max(runningSum,currentSum);

            if(currentSum<0)
            {

                currentSum=0;
                // System.out.println("current in if"+currentSum);
            }




        }
        return runningSum;
    }
}