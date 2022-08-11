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
//to find smallest element in the arrey which is greater than target
public class celing_number {
    public int celling(int arr[],int target){
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
        return start;
    }
    public static void main(String[] args) {
        
        celing_number h=new celing_number();
        
        int[] arr= {2,3,5,9,14,16,18};
        
        int target=15;
        
        int r=h.celling(arr, target);
        
        System.out.println("index of the number is ="+r);
        
    }
    
}
