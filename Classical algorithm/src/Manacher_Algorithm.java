/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Manacher_Algorithm
 * Author:   mac
 * Date:     2018/10/21 2:46 PM
 * Description: 马拉车算法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈马拉车算法〉
 *
 * @author mac
 * @create 2018/10/21
 * @since 1.0.0
 */
public class Manacher_Algorithm {
    public static String Manacher(String s) {
        // Insert '#'
        String t = "$#";
        for (int i = 0; i < s.length(); ++i) {
            t += s.charAt(i);
            t += "#";
        }
        t += "@";
        // Process t
        int[] p = new int[t.length()];
        ;
        int mx = 0, id = 0, resLen = 0, resCenter = 0;
        for (int i = 1; i < t.length() - 1; ++i) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 1;
            while (((i - p[i]) >= 0) && ((i + p[i]) < t.length()) && (t.charAt(i + p[i]) == t.charAt(i - p[i])))
                ++p[i];
            if (mx < i + p[i]) {
                mx = i + p[i];
                id = i;
            }
            if (resLen < p[i]) {
                resLen = p[i];
                resCenter = i;
            }
        }
        return s.substring((resCenter - resLen) / 2, (resCenter - resLen) / 2 + resLen - 1);
    }

    public static void main(String[] args) {
        String str = "aaaba";
        System.out.println(Manacher(str));
    }
}

