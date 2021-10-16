package LeetcodeQuestions;

public class BuyAndSellStock {
    //here I am iterating through whole list for each element hence time complexity will be n^2
    //time limit exceeded for this
    public int maxProfit(int[] prices)
    {
        int maxPro=0;
        int currentPro=0;

        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                currentPro=prices[j]-prices[i];
                maxPro=Math.max(maxPro,currentPro);
            }
        }
        return maxPro;
    }

    public int OptimizedmaxProfit(int[] prices)
    {
        int maxPro=0;
        int currentPro=0;
        int minCost=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            //profit=sellingPrice-costPrice
            currentPro=prices[i]-minCost;
            maxPro=Math.max(maxPro,currentPro);
            //if current element is minimum till now, we will take it as minCost
            minCost=Math.min(minCost,prices[i]);
        }
        return maxPro;
    }
}
