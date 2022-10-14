/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        //Write code here
        int[] data = {5,24};
        //int[] data = {4,40};

        int[] price = {4,8,9,7,2};
        //int[] price = {1,2,1,2};

        System.out.println(maxItems(price,price.length,data[0],data[1]));
        

    }

    static int maxItems(int[] priceArray, int sizeOfPriceArray,
                        int itemsToBuy,int maxAmount)
    {
        Arrays.sort(priceArray);
        int[] pre = new int[sizeOfPriceArray];
        int i, ans = 0;

        pre[0] = priceArray[0];

        if (pre[0] <= maxAmount)
            ans = 1;

        do {
            for(i = 1; i < itemsToBuy; i++)
            {
                pre[i] = pre[i - 1] + priceArray[i];

                if (pre[i] <= maxAmount)
                    ans = ans + 1;
            }
            maxAmount = maxAmount - pre[itemsToBuy-1];

        } while (pre[itemsToBuy-1] < maxAmount);

        for(i = 0; i < itemsToBuy-1; i++)
        {
            if (pre[i] <= maxAmount)
                ans = ans + 1;
        }
        return ans;
    }

}
