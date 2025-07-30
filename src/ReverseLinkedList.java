/*
Intellij might show an error where it says that it
cannot access the ListNode but that is most likely a bug
because the code runs just fine
Also make sure for the ListNode file to be present alongside this to run
*/
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversedhead=reverseList(head);
        ListNode temp=reversedhead;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
    static public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode future=curr.next;
            curr.next=prev;
            prev=curr;
            curr=future;
            if(future!=null) {
                future = future.next;
            }
        }
        return prev;
    }
}
