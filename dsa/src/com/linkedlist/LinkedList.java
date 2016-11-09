package com.linkedlist;

public class LinkedList {
	
	Node head;  // head of list
	 
    
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
    	/* Start with the empty list. */
        LinkedList llist = new LinkedList();
 
        llist.head  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
 
        llist.head.next = second;
        
        second.next = third;
        
        //traversing linked list
        llist.printList();
    }
    
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
}
