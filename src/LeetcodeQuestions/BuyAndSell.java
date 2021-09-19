package LeetcodeQuestions;

//here we are checking for every [possibility  by using two for loops one  inside one starting from i+1
public class BuyAndSell {
    class Solution {
        public int maxProfit(int[] prices)
        {
            int maxPro=0;
            int result=0;
            System.out.println(maxPro);
            for(int i=0;i<prices.length;i++)
            {
                for(int j=i+1;j<prices.length;j++)
                {
                    result=prices[j]-prices[i];

                    maxPro=Math.max(maxPro,result);

                }
            }
            return maxPro;
        }
    }
}
