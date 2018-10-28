/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution17
 * Author:   mac
 * Date:     2018/10/28 9:15 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈merge-two-sorted-lists〉<对应第二十一题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/28
 * @since 1.0.0
 */

class ListNode {
    int val;
    Node next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution17 {
    public static Node mergeTwoLists(Node l1, Node l2) {
        if(l1==null&&l2==null)
            return null;
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        Node head = new Node(0);
        Node current1 = l1;
        Node current2 = l2;
        Node current3 = head;

        if (l1.val <= l2.val) {
            head.val = l1.val;
            current1 = l1.next;
        } else {
            head.val = l2.val;
            current2 = l2.next;
        }

        while (current1 != null && current2 != null) {
            Node node = new Node(0);

            if (current1.val <= current2.val) {
                node.val = current1.val;
                current3.next= node;
                current3 = current3.next;
                current1 = current1.next;
            } else {
                node.val = current2.val;
                current3.next= node;
                current3 = current3.next;
                current2 = current2.next;
            }
        }

        if(current1==null&&current2==null)
            return head;
        else if(current1!=null&&current2==null)
            current3.next=current1;
        else
            current3.next=current2;

        return head;
    }
}

