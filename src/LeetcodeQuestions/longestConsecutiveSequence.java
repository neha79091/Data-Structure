package LeetcodeQuestions;

public class longestConsecutiveSequence {

    class Solution {
        public int longestConsecutive(int[] nums)
        {
            //if array is empty, return 0
            if(nums==null || nums.length==0)return 0;
            Arrays.sort(nums);
            // "for(int num :nums)
            // {System.out.println(num);}"
            //make a hashset to store the lengths of different consecutive elements
            HashSet<Integer> set=new HashSet<>();
            //adding 0 in case nothing is consecutive
            set.add(0);
            //taking running element to compare
            int runningEle=nums[0];
            //initiating length
            int elelength=1;
            for(int num :nums)
            {
                //if the current element is consecutive, length is increased and running element is updated
                if(num==runningEle+1)
                {
                    runningEle=num;
                    elelength++;

                }
                //if the element is same we'll do nothing
                else if(num==runningEle)
                {
                    continue;
                }
                //if element is not consecutive, we will add length in set and update running element and initiate length
                else
                {
                    set.add(elelength);
                    runningEle=num;
                    elelength=1;
                }
            }
            //if consecutive elements last till last index, we need to add them after for loop
            set.add(elelength);
            return Collections.max(set);
        }
    }

}
