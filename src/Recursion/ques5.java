package Recursion;

import java.util.Scanner;

public class ques5 {
    // non returning
//    static void find(int arr[],int currentIndex,int search_value)
//    {
//        if(currentIndex>=arr.length)
//            return;
//        if(arr[currentIndex]==search_value) {
//            System.out.println(currentIndex);
//            return;
//        }
//        find(arr,currentIndex+1,search_value);
//    }
    //returning
    static int find(int arr[],int currentIndex,int search_value){
        if(currentIndex>=arr.length)
            return -1;
        if(arr[currentIndex]==search_value)
            return currentIndex;
        return find(arr,currentIndex+1,search_value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 4, 2, 6};
        int val = 2;
        System.out.println(find(arr, 0, val));
    }
}