/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution2
 * Author:   mac
 * Date:     2018/10/13 10:53 AM
 * Description: 最长回文子序列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈longest-palindromic-substring〉<对应第五题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/13
 * @since 1.0.0
 */
public class Solution2 {


    public static String longestPalindrome(String s) {
        if (s.equals(""))
            return null;
        int n = s.length();
        String res = null;

        boolean[][] dp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome(""));
    }
}

