

public class q2 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode curr=null;
        ListNode prev=null;
        ListNode forward=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        curr=slow.next;
        slow.next=null;
        while(curr!=null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        slow=head;
        fast=prev;
        while(slow!=null && fast!=null){
            if(slow.val!=fast.val) return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}
