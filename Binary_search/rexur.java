/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author RR
 */
//binary search using recursion...

public class rexur {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,9,77,88,99};
        int target=8;
        int s=0;
        System.out.println("index of number is = "+search(arr,target,s,arr.length-1)); 
    }
    static int search(int[] arr ,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        if(arr[m]==target){
            return m;
        }
       return search(arr,target,m+1,e);
    }
}
