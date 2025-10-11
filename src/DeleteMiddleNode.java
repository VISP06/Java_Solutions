public class DeleteMiddleNode {
    public static void main(String[] args) {
        //this is an edge case where there is only one element in the list so we return null
        //as soon as we enter the function with the help of the starting if conditional
        ListNode head = new ListNode(7);
        ListNode newHead = deleteMiddle(head);
        ListNode temp = newHead;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    /*utilize the slow and fast pointer approach with the addition of a third pointer behind
      the slow pointer which is responsible for deleting the middle element*/
    //Note: whenever a problem involves the i'th element think of this fast and slow pointer approach
    static public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next==null){
            return null;
        }
        ListNode dummyHead = head;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=prev.next;
        prev.next=null;

        return dummyHead;
    }
}
