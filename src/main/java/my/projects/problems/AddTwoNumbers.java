package my.projects.problems;

import my.projects.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyhead = new ListNode(0);

        ListNode curr = dummyhead;

        int carry = 0;

        while(l1 != null || l2 != null){

            int x = carry + ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0);
            carry = x/10;

            curr.next = new ListNode(x % 10);

            curr = curr.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        return dummyhead.next;

    }

    public static void main (String args[]){

        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("l1 :  " + l1.val + "->" + l1.next.val + "->" + l1.next.next.val);
        System.out.println("l2 :  " + l2.val + "->" + l2.next.val + "->" + l2.next.next.val);
        System.out.println("Result :  " + result.val + "->" + result.next.val + "->" + result.next.next.val);

    }

}
