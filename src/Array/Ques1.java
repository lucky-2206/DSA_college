/*Me Bean is very good in mathematics. He was given a number n and was told to find out number of trailing zeroes in n! (Factorial) . Can you help him?

Sample Input
5
Sample Output
1
Explanation
5! (Factorial) is 120, so there is one trailing zero.

Implement it by using loop */

package Array;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1,tzero=0;
        for(int i =1;i<=n;i++)
            fact *= i;
        while(fact!=0)
        {
            if(fact%10 !=0)
                break;
            else
                tzero++;
            fact /=10;
        }
        System.out.println(tzero);
    }
}
