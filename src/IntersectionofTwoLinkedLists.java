public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(10))));
        ListNode headB = new ListNode(8, new ListNode(9, new ListNode(10)));
        ListNode inter = getIntersectionNode(headA, headB);
        ListNode temp=inter;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("NULL");

    }
    static public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        if (temp1 == null) {
            temp1=headB;
        }
        else{
            temp1=temp1.next;
        }
        if(temp2 == null) {
            temp2=headA;
        }
        else{
            temp2=temp2.next;
        }
        return temp1;
    }
}
