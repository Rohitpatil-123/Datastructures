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
//smallest letter from the arrey greater than target

public class smallest_letter {
    
    public char letterr(char arr[],char target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid =start+(end-start)/2;
            
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
                    
        }
        return arr[start%arr.length];
    }
    public static void main(String[] args) {
        smallest_letter h=new smallest_letter();
        
        char arr[]={'a','b','d','f','k'};
        
        char target='d';
        
        char u=h.letterr(arr, target);
        
        System.out.println(u);
    }
}
