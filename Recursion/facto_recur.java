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
//factorial of number with recursion.
public class facto_recur {
    public static void main(String[] args) {
        int c=fact(5);
        System.out.println(c);
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    
}
