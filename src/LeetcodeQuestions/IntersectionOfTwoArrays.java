package LeetcodeQuestions;

public class IntersectionOfTwoArrays {
    //in this solution I am, checking each element in the second list for each element of first list if
    //there is a match, if match is found I am replacing that with -1 so that there is no repetition
    //and storing it in arraylist, then iterating through arrayListto store each element in the array and returning the same
    public int[] intersect(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> arrList=new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if((nums1[i]==nums2[j])&&(nums1[i]>=0) )
                {
                    arrList.add(nums1[i]);
                    nums1[i]=-1;
                    nums2[j]=-1;

                }
            }
        }
        int[] result=new int[arrList.size()];
        for(int i=0;i<arrList.size();i++)
        {
            result[i]=arrList.get(i);
        }
        return result;
    }
}
