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
import java.util.*;
public class stack {
    int top=-1;
    int n=5;
    int a[]=new int[n];
    public void underflow(){
        if(top==-1){
            System.out.println("stack is empty!!!");
        }
    }
    public void push(int data){
         if(top==(n-1)){
            System.out.println("stack is full!!!");
        }
         else{
        top++;
        a[top]=data;
             System.out.println("inserted");
         }
        
    }
    public void pop(){
        top--;
        System.out.println("deleted");
    }
    
    public void prnt(){
        for(int i=top;i>=0;i--){
        System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        stack h=new stack();
        h.push(40);
        h.push(30);
        h.pop();
        h.prnt();
    }
    
}
