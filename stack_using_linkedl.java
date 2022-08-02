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

//implementing stack using linked list.
public class stack_using_linkedl {
    Node head=null;
    //creating node
    public class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //creating method to insert data
    public void insrtbeg(int data){
        Node new_node =new Node(data);
        if(head==null){
           head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
    }
    //method for deleting top element
    public void delete(){
        head=head.next;
    }
    
    //printing list
    public void print(){
        Node curr=head;
        
        if (head==null){
            System.out.println("stack is empty!!!!");
        }
        while(curr!=null){
            System.out.print(curr.data+"-->");
         
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        stack_using_linkedl k=new stack_using_linkedl();
        k.insrtbeg(7);
        k.insrtbeg(9);
        k.print();
        k.delete();
        k.delete();
        k.print();
        k.insrtbeg(3);
        k.insrtbeg(6);
        k.print();
    }
    
}
