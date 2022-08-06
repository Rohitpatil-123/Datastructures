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
// this program is for reverse the Linked List 

public class reverse_LL {
    Node head;
    private int size;
    
   
    public class Node{
        
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }   
}
    public void Addfirst(String data){
        Node newnode =new Node(data);
          
        newnode.next=head;
        head=newnode;
        
    }
     public void reverse(){
        Node curr=null;
        Node curr2=head;
        Node curr3=curr2.next;
        
        while(curr2!=null){
            curr2.next=curr;
            curr=curr2;
            curr2=curr3;
            if(curr3 != null){
                curr3=curr3.next;
            }
        }
        head=curr;
        
    }
    
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        
        Node tnode=head;
        while(tnode.next !=null){
            tnode=tnode.next;
        }
        tnode.next=newnode;
    }
    
    public void prntl(){
        
        Node tnode=head;
        while(tnode !=null){
            System.out.print(tnode.data+"->");
            tnode=tnode.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[] args) {
        reverse_LL h=new reverse_LL();
        h.Addfirst("rohit");
        h.addlast("sanjay");
        h.addlast("patil");
        h.prntl();
        h.reverse();
        h.prntl();
    }
    
}
