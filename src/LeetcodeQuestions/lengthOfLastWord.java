package LeetcodeQuestions;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s)
    {
        int ptr1=0;
        int ptr2=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                ptr2=i;
                break;
            }
        }
        ptr1=-1;

        for(int i=ptr2;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                ptr1=i;
                break;
            }
        }
        return (ptr2-ptr1);
    }
}
