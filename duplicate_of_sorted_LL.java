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
public class duplicate_of_sorted_LL {
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
     public void duplicate(){
        Node curr=head;
        
        while(curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
                
            }
            else{
                curr=curr.next;
            }
        }
    }
    public static void main(String[] args) {
        mid_of_LL h=new mid_of_LL();
        h.create(1);
        h.create(1);
        h.create(2);
        h.create(2);
        h.create(3);
        h.create(3);
        h.create(3);
        h.print();
      //  h.mid();
        h.duplicate();
       // h.removed();
        h.print();
    }
    
    
}
