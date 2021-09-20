package LeetcodeQuestions;
//this is a brute force solution where I am iterating through whole array twice to find all the combinations and finding
// two sum
public class TwoSum {
    public int[] twoSum(int[] nums, int target)
    {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
//in this solution, I am storing complement of all the elements ie.(target-nums[i]) in my hashmap and checking for the same
    // by iterating through the whole array. if index is same I am ignoring that as it is the condition given in ques
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            map.put((target-nums[i]),i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])&& i!=map.get(nums[i]))
            {
                arr[0]=i;
                arr[1]=map.get(nums[i]);
            }

        }
        return arr;
    }
}
