/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution6
 * Author:   mac
 * Date:     2018/10/14 1:00 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈palindrome-number〉<对应第九题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/14
 * @since 1.0.0
 */
public class Solution6 {
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x==0)
            return true;
        String str =Integer.toString(x);
        char c[]=str.toCharArray();
        for(int i=0;i<c.length/2;i++){
            if(c[i]==c[c.length-1-i])
                continue;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(-121));
    }
}

