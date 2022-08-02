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

//creating doubly list

public class doublyll {
    Node head=null;
    Node tail=null;
    int size=0;
   
    public static class Node{
    
    String data;
    Node next;
    Node prev;
    
    Node(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
                
    }  
      }
    //inserting node at begining
    public void createn(String data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            head.prev=new_node;
            new_node.next=head;
            head=new_node;
            
        }
        size++;
    }
    //iinserting node at any index.
    public void bichme(int ind ,String data){
        Node curr=head;
        Node curr2=head.next;
        Node new_node=new Node(data);
        for (int i=0;i<ind-2;i++){
            curr=curr.next;
            curr2=curr.next;
        }
        new_node.prev=curr;
        new_node.next=curr2;
        curr.next=new_node;
        curr2.prev=new_node;
        size++;
        
    }
    //inserting element at last
    public void createl(String data){
        Node new_node=new Node(data);
        
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            tail.next=new_node;
            new_node.prev=tail;
            tail=new_node;
            
        }
        size++;
    }
    //deleting node at begining
    public void delb(){
        head=head.next;
        size--;
    }
    //deleting node at last
    public void dell(){
       
       tail=tail.prev;
       size--;
       
    }
    //deleting node at any position
    public void del(int ind){
        
        Node curr=head;
        Node curr2=head.next;
        for (int i=0;i<ind-2;i++){
            curr=curr.next;
            curr2=curr2.next;
            
        }
        curr.next=curr2.next;
        size--;
    }
    //printing list
    public void prnt(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("");
    }
    //to track size of list
    public int gsize(){
        return size;
    }
    public void max(){
        
    }
    public static void main(String[] args) {
        doublyll b=new doublyll();
        b.createn("rohit");
        b.createn("patil");
       // b.prnt();
        b.createn("kasa_ahes");
      //  b.prnt();
        b.createl("mi");
        b.prnt();
       // b.del(2);
       // b.prnt();
        //b.delb();
       // b.dell();
       b.bichme(2,"boss");
        b.prnt();
        System.out.println(b.gsize());
    }
    
}
