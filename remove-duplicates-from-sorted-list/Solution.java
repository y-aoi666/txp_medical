/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return null;
        }
        // 参照のためのカーソルを用意
        ListNode cursor = head;

        // カーソルの当たっている箇所の次がNULLでない間ループ
        while(cursor.next != null){
            // カーソルとカーソルの次の値が同じならば
            if(cursor.val == cursor.next.val){
                // カーソルの次の参照を、さらに次の参照で上書きする
                cursor.next = cursor.next.next;
            }else{
                // カーソルの次の参照は据え置く
                cursor = cursor.next;
            }
        }
        return head;
    }
}