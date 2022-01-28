package Recursion;

import java.util.Scanner;

public class ques7 {
    static  String replace(int i,String st,char c,char ch)
    {
       if(i==st.length())
           return "";
       if(st.charAt(i)==c)
           return ch+replace(i+1,st,c,ch);

           return st.charAt(i)+replace(i+1,st,c,ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char c = sc.next().charAt(0);
        char ch = sc.next().charAt(0);

        System.out.println(replace(0,st,c,ch));
    }
}
