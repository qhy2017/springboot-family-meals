package qhy.example.web.util.sf;

import java.util.HashMap;
import java.util.Map;

public class SF {
    public static void main(String[] args) {
        System.out.println(lengthOfSubstring("abcdabchfkajfkldjklfjlesajflj"));
    }

    /**
     * 统计最长子字符串长度
     */
    static int strMaxLength(String s) {
        //最大值
        int max = 0;
        //初始位置指针
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                //如果存在把当前指针往左移
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            map.put(s.charAt(j), j);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    static int lengthOfSubstring(String s) {
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()) {
            int pos = s.indexOf(s.charAt(i), flag);
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= s.length() - pos - 1) {
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;
    }
}
