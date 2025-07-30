public class RemoveDuplicatesFromLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(5)))));
        //The Linked list (LL) before deletion of duplicate elements
        System.out.println("Before removal of duplicates:-");
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
        //The LL after deletion of duplicate elements
        System.out.println("After removal of duplicates: ");
        ListNode newHead=deleteDuplicates(head);
        temp=newHead;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == temp.next.val) {
                ListNode dup = temp;
                dup.next = dup.next.next;
            } else {
                temp = temp.next;
            }
            if (temp.next == null) {
                break;
            }
        }
        return head;
    }
}
