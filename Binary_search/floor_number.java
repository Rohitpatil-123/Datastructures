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
//code for greatest number from arrey which is smaller than target element.

public class floor_number {
    
     public int flooor(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
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
        return end;
    }
    
    public static void main(String[] args) {
        
       floor_number h=new floor_number();
        
        int[] arr= {2,3,5,9,14,16,18};
        
        int target=15;
        
        int r=h.flooor(arr, target);
        
        System.out.println("index of the number is ="+r);
    }
    
}
