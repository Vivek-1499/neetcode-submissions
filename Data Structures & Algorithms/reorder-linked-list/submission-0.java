/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        // ListNode last = head;
        // while(last.next != null){
        //     len++;
        //     last = last.next;
        // }
        // ListNode curr = head;

        // while(curr.next != null){
        //     ListNode temp = curr.next;
        //     curr.next = last;
        //     last.next
        // }
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list1 = reverse(slow.next);
        slow.next = null;

        ListNode l1 = head, l2 = list1;
        while(l2 != null){
            ListNode t1 = l1.next;
            ListNode t2 = l2.next;

            l1.next = l2;
            l2.next = t1;

            l1 = t1;
            l2 = t2;
        }

    }
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
