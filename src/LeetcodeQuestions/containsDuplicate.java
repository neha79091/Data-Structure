//I used hashmap to keep track of all the integers, whenever one is repeating, containsKey tells me so
//hence I return true then

package LeetcodeQuestions;

class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
