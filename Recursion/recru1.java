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
public class recru1 {
    public static void main(String[] args) {
        int n=6;
       num(n);
        num2(n);
    }
    static void num(int n){
        if(n==0){
            return;
        }
        
        System.out.println(n);
        num(n-1);
    }
    
     static void num2(int n){
        if(n==0){
            return;
        }
        num2(n-1);
        System.out.println(n);
             
    }
}
