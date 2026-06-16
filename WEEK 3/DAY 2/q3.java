
public class q3 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast!=null){
            if(fast.next==null){
                slow.next=slow.next.next;
                return head;
            }
            else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        return head;
    }
}
