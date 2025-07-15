class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> val = new ArrayList<>();

        for (ListNode head : lists) {
            while (head != null) {
                val.add(head.val);
                head = head.next;
            }
        }

        Collections.sort(val);  
        
        ListNode temp = new ListNode(0);
        ListNode current = temp;

        for (int v : val) {
            current.next = new ListNode(v);
            current = current.next;
        }

        return temp.next;
    }
}
