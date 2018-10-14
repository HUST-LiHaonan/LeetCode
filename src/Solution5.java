/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution5
 * Author:   mac
 * Date:     2018/10/14 12:34 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈string-to-integer-atoi〉<对应第八题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/14
 * @since 1.0.0
 */
public class Solution5 {
    public static int myAtoi(String str) {
        if (str.isEmpty())
            return 0;
        str = str.trim();
        int i = 0, ans = 0, sign = 1, len = str.length();
        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '+' ? 1 : -1;
        for (; i < len; ++i) {
            int tmp = str.charAt(i) - '0';
            if (tmp < 0 || tmp > 9)
                break;
            if (ans > Integer.MAX_VALUE / 10
                    || (ans == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < tmp))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else
                ans = ans * 10 + tmp;
        }
        return sign * ans;
    }

    public static void main(String[] args){
        System.out.println(myAtoi("words and 987" ));
    }
}

