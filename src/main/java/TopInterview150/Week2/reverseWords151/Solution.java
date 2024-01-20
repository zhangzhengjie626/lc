package TopInterview150.Week2.reverseWords151;

/**
 * 151. 反转字符串中的单词
 */
public class Solution {
    public String reverseWords(String s) {
        //我的思路：整体翻转，再逐个单词翻转
        StringBuilder sb = new StringBuilder();
        //单词翻转
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                int start = i;
                int end = i;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) != ' '){
                        end++;
                    } else {
                        break;//寄0：忘记break了，导致一直往后累加了
                    }
                }
                //翻转
                for (int j = end; j >= start; j--) {
                    sb.append(s.charAt(j));
                }
                sb.append(" ");//寄1：每个单词都加，导致最后一个单词多了个空格，但是怎么判断是最后一个单词呢？感觉判断不了，，，
                i = end;
            }
        }
        //整体翻转
        s = sb.toString();
        StringBuilder sb1 = new StringBuilder();
        for (int i = s.length() - 1 - 1; i >= 0 ; i--) {
            sb1.append(s.charAt(i));
        }
        return sb1.toString();
    }
}