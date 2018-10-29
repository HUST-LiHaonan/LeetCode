/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution20
 * Author:   mac
 * Date:     2018/10/29 9:02 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈swap-nodes-in-pairs〉<对应第二十四题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/29
 * @since 1.0.0
 */
public class Solution20 {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        if(head.next==null)
            return head;
        ListNode current = head;
        while (current != null&&current.next!=null) {
            int temp = current.val;
            current.val = current.next.val;
            current.next.val = temp;
            current=current.next.next;

        }
        return head;
    }
}

