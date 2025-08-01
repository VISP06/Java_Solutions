public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(hasCycle(head));
    }
    static public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
/*this problem involves us using the slow and fast pointer method
one pointer travels twice as fast as the other
the theory is that if there indeed is a cycle then the 2 pointers will eventually meet*/
/*the while condition prevents fast going beyond the LL incase it is not a
cyclic list and also prevent it from it pointing to NULL*/
//when fast and slow meet then we can return true as we have approced that the linked list is a cycle