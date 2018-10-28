/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution15
 * Author:   mac
 * Date:     2018/10/28 8:39 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈remove-nth-node-from-end-of-list〉<对应第十九题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/28
 * @since 1.0.0
 */

  class Node {
      int val;
      Node next;
      Node(int x) { val = x; }
  }

public class Solution15 {
    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        int length  = 0;
        Node first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}

