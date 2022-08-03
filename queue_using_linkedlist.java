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

//this code is for queue using linked list.

public class queue_using_linkedlist {
    Node front=null;
    Node rear=null;
    public class Node{
        int data;
        Node next;
        
      public Node(int data){
            this.data=data;
            this.next=null;
            
        }
    }
    public void createn(int data){
        Node newnode=new Node(data);
        
        if(front==null){
            front=newnode;
            rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
    }
    public void delete(){
        front=front.next;
        
    }
    public void print(){
        Node curr=front;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
    }
        System.out.println("");
    }
    public static void main(String[] args) {
        
        queue_using_linkedlist h=new queue_using_linkedlist();
        
        h.createn(7);
        h.createn(8);
        h.print();
        h.delete();
        h.print();
    }
}
