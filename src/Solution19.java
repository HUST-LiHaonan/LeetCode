/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution19
 * Author:   mac
 * Date:     2018/10/28 10:24 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * 〈merge-k-sorted-lists〉<对应第二十三题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/28
 * @since 1.0.0
 */
public class Solution19 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        ArrayList<Integer> ans = new ArrayList <>();
        ListNode head;

        for(int i=0;i<lists.length;i++){
            head = lists[i];

            while (head!=null){
                ans.add(head.val);
                head=head.next;
            }
        }

        Collections.sort(ans);
        ListNode dummy  = new ListNode(ans.get(0));
        ListNode currnt  = dummy;
        for(int j=1;j<ans.size();j++){
            ListNode node = new ListNode(ans.get(j));
            currnt.next=node;
            currnt = currnt.next;
        }

        return dummy;

    }
}

