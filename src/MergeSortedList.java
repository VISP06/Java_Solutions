public class MergeSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10))));
        ListNode list2 = new ListNode(4, new ListNode(8, new ListNode(8, new ListNode(12))));
        ListNode newHead=mergeTwoLists(list1, list2);
        while(newHead!=null){
            System.out.print(newHead.val+"->");
            newHead=newHead.next;
        }
        System.out.print("NULL");
    }
    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        if(list1!=null){
            temp.next=list1;
        }
        if(list2!=null){
            temp.next=list2;
        }
        return dummyHead.next;
    }
}
