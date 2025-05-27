/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
        
         while(lenB>lenA){
            headB=headB.next;
            lenB--;
        }

        while(headA!=null && headB!=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;

        }
        return null;

      
    }

        private int getLength(ListNode head){
          int length = 0;
          while(head!=null){
            head = head.next;
            length++;
          }
          return length;
        }
}