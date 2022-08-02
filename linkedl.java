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

//creating linked list and performing 
//insertion at begining ,last and at any position
//deletion at any position
//printing the linked list
//searching any node 

public class linkedl {
     Node head;
     
    //creating node
  public class Node{
        
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
            
        }
  
   
}
 //inserting node at begining
   public void create(String data){
       Node new_node=new Node(data);
       if(head==null){
          head=new_node;
          return;
       }
       else{
           new_node.next=head;
           head=new_node;
       }
        
    }
   //printing list
   public void print(){
       Node temp=head;
       while(temp!=null){
       System.out.print(temp.data+"-->");
       temp=temp.next;
       }
       
   }
   //searching string in list
   public void search(String s){
       Node curr=head;
       int index=0;
       while(curr!=null){
           if(s==curr.data){
               System.out.println("element present in the list");
           }
           index++;
           curr=curr.next;
           
       }
   }
   //inserting node at last
   public void lastin(String data){
       
       Node new_node=new Node(data);
       Node curr=head;
      while(curr.next!=null){
          curr=curr.next;
          
      }
       curr.next=new_node;
   }
   //inserting node at specific index
   public void instatm(int r,String data){
       Node ne_node=new Node(data);
       Node curr=head;
       for (int i=0;i<(r-2);i++){
           curr=curr.next;
       }
       ne_node.next=curr.next;
       curr.next=ne_node;
   }
   
  //deleting node at begining
   public void rmf(){
       Node curr=head;
       
       head=curr.next;
   }
   //deleting node from last
   public void rml(){
       Node curr=head;
       Node curr2=head.next;
       while(curr2.next!=null){
           curr=curr.next;
           curr2=curr2.next;
       }
       curr.next=null;
   } 
   //deleting node from perticular index
   public void rmb(int n){
       Node curr=head;
       Node curr2=head.next;
       for(int i=0;i<(n-2);i++){
           curr=curr.next;
           curr2=curr2.next;
       }
       curr.next=curr2.next;
       
   }
    public static void main(String[] args) {
        linkedl hi=new linkedl();
        hi.create("rohit");
        hi.create("sanjay");
        hi.create("patil");
        hi.lastin("kasa_ahz");
        hi.instatm(3, "king");
        hi.print();
       // hi.rmf();
       // hi.rml();
        hi.rmb(2);
        System.out.println("");
        hi.print();
       // hi.search("rohit");
        
    }
}