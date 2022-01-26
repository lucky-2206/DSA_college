package Recursion;

import java.util.Scanner;

public class ques6 {

    static void res(int arr[],int currentIndex,int search_value)
      {
        if(currentIndex>=arr.length)
            return;
        if(arr[currentIndex]==search_value) {
            System.out.println(currentIndex);
        }
        res(arr,currentIndex+1,search_value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 7, 4, 7, 6};
        int val = 7;
        res(arr, 0, val);
    }
}

