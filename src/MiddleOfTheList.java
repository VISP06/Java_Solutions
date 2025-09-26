public class MiddleOfTheList {
    public static void main(String[] args) {
        ListNode evenList = new ListNode(1, new ListNode(2, new ListNode(3,
                            new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode newHead=middleNode(evenList);

        while(newHead!=null){
            System.out.print(newHead.val+"->");
            newHead=newHead.next;
        }
        System.out.print("NULL");
    }
    static public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
/*
For this question we utilize the 2 pointers approach where
one pointer moves twice as fast as the other.
By the end of the iteration, fast will have reached the end whereas slow would be at the middle
because slow is slower (takes 1 step forward) than fast (takes 2 step forward).Hence fast would
reach the end twice as fast as slow and since the loop is meant to terminate when that does happen
we just return slow, as it would be at the middle at the time.
*/

