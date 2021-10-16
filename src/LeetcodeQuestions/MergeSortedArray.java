package LeetcodeQuestions;
//I am storing all elements in Arraylist, sorting the list and then overwriting the nums1 array
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arrList=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            arrList.add(nums1[i]);
        }
        for(int num:nums2)
        {
            arrList.add(num);
        }
        Collections.sort(arrList);
        for(int i=0;i<arrList.size();i++)
        {
            nums1[i]=arrList.get(i);
        }
    }
}
