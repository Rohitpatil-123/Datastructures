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
//this program is to find middle of linked list.
public class mid_of_LL {
    Node head=null;
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
            
        }       
    }
    public void create(int data){
        Node new_node=new Node(data);
        Node curr=head;
        if(head==null){
            head=new_node;        
        }
        else{
            
            while(curr.next!=null){
                curr=curr.next;
                
            }
            curr.next=new_node;
        }
    }
    public void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public int lengthh(){
        Node curr=head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;        
        }
        return length;
    }
    
    public void mid(){
        Node curr=head;
        int length=lengthh();
        int mid=length/2;
        
        while(mid!=0){
            curr=curr.next;
            mid--;
        }
        System.out.println("middle element of linked list is ="+curr.data);
     
    }
    public static void main(String[] args) {
        mid_of_LL h=new mid_of_LL();
        h.create(6);
        h.create(8);
        h.create(2);
        h.create(5);
        h.create(3);
        h.print();
        h.mid();
    }
    
}
