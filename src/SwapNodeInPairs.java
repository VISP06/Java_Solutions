import org.w3c.dom.Node;

public class SwapNodeInPairs {
    public static void main(String[] args) {
        ListNode listPrime = new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10))));
        ListNode newHead=swapPairs(listPrime);
        while(newHead!=null){
            System.out.print(newHead.val+"->");
            newHead=newHead.next;
        }
        System.out.print("NULL");
    }
    static public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2!=null){
            //swapping the node pairs
            p1.next=p2.next;
            p2.next=p1;
            //re-linking the pairs
            prev.next=p2;
            prev=p1;
            //advancing the pointers
            p1=p1.next;
            if(p1!=null){
                p2=p1.next;
            }else{
                p2=null;
            }
        }
        return dummy.next;
    }
}
