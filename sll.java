package com.company;

public class sll {

    private ListNode head;

    private static class ListNode{
        private final int data;
        private sll.ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        sll.ListNode current = head;
        while( current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        sll s = new sll();
        s.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third  = new ListNode(3);
        ListNode fourth = new ListNode(4);
        //now we will connect together to form a chain
        s.head.next = second; // 10-->1
        second.next   = third;  // 10-->1-->8
        third.next    = fourth; // 10-->1-->8-->11

        s.display();
    }
}
