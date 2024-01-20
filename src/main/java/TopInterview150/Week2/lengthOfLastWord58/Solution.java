package TopInterview150.Week2.lengthOfLastWord58;

/**
 * 58. 最后一个单词的长度
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        //我的思路：从前往后遇到空格重新记录长度，并判断是否最长
        //晕了，看错题目了，还做了两次，sb了
//        int ans = 0;
//        int curWordLength = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' '){
//                curWordLength = 0;
//            } else{
//                curWordLength++;
//            }
//            //每次都判断是否是最长？遇到空格再判断的话，可以减少判断次数，但是会漏掉最后一个是单词，不是空格结尾的情况
//            ans = Math.max(ans, curWordLength);
//        }
//        return ans;

        //从短到长，每个单词比较是否被包含的话，就是O(n^2)了，估计是不行的，试一下吧，做不出来，拉倒
//        int ans = 0;
//        String[] s1 = s.trim().split(" ");
//        for (int i = 0; i < s1.length; i++) {
//            for (int j = 0; j < s1.length; j++) {
//                if (j != i) {
//                    //先把包含其他单词的置空
//                    if (!s1[i].isEmpty() && !s1[j].isEmpty() && s1[i].contains(s1[j])) {
//                        s1[i] = "";
//                        break;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < s1.length; i++) {
//            ans = Math.max(s1[i].length(), ans);
//        }
//
//        return ans;
//    }
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) !=' '){
                ans++;
            } else {
                if(ans != 0){
                    break;
                }
            }

        }
        return ans;
    }
}
//寄1：需要判断子串，感觉一下就难起来了，是简单题？
//“Today is a nice day”  输出的是day
//从短到长，每个单词比较是否被包含的话，就是O(n^2)了，估计是不行的，试一下吧