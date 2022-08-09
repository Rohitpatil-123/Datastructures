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
//simple binary search 

public class binary_search {
     //function for binary search.
     public int binarysearch(int arr[], int target){
         
         int start=0;
         int end=arr.length-1;
         
         
         
         while(start<=end){
             int mid=start + (end-start)/2;
             if(target<arr[mid]){
                 end=mid-1;
             }
             else if(target>arr[mid]){
                 start=mid+1;
             }
             else{
                 return mid;
             }
             
         }
         return -1;
        
    }
    public static void main(String[] args) {
        
        binary_search h=new binary_search();
        
        int[] arr= {2,4,6,8,10,13,16,18,22};
        
        int target=13;
        
        int r=h.binarysearch(arr, target);
        
        System.out.println("index of the number you are searching is ="+r);
        
    }
   
   
}
