/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution21
 * Author:   mac
 * Date:     2018/11/4 4:33 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈reverse-nodes-in-k-group〉<对应第25题>
 * 〈〉
 *
 * @author mac
 * @create 2018/11/4
 * @since 1.0.0
 */
public class Solution21 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)
            return null;

        ListNode dummy = head.next,temp = head,T = temp;

        if(k == 0 || k == 1)
            return head;
        for(int i = 1;i < k;i++){
            if(T.next == null)
                return head;
            else
                T = T.next;
        }
        if(dummy == null)
            return head;
        for(int K = k;K > 1;--K)
        {
            head.next = dummy.next;
            dummy.next = temp;
            temp = dummy;
            dummy = head.next;
        }
        head.next = reverseKGroup(dummy,k);
        return temp;
    }
}

