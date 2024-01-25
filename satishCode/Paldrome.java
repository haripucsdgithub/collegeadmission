package Sk;

import java.util.Scanner;

public class Paldrome {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        char[] arr= new char[size];
        System.out.println("enter element of array");
        for(int i=0; i<size; i++){
            arr[i]=scanner.next().charAt(0);
        }
        CheckArrayIsPalidromeOrNot(arr,size);
    }
    public static void CheckArrayIsPalidromeOrNot(char[] arr , int size){
        int a=0;
        for(int i=0;i<arr.length/2;i++){
            size--;
           if(arr[i]!=arr[size]){
               a=1;
           }
        }
        if(a==0){
            System.out.println("given array is palidrome");
        }
        else
        {
            System.out.println("given array is not palidrome");
        }
    }
}
